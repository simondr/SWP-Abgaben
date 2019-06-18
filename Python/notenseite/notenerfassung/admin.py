from django.contrib import admin
from .models import Klasse, Lehrer, Schueler, Fach, Note, Unterrichtet


# Register your models here.

class NoteModel(admin.ModelAdmin):
    def get_queryset(self, request):
        qs = super().get_queryset(request)
        s = Schueler.objects.filter(user=request.user)
        l = Lehrer.objects.filter(user=request.user)
        if s.exists():
            schueler = Schueler.objects.get(user=request.user)
            return qs.filter(schueler=schueler)
        if l.exists():
            lehrer = Lehrer.objects.get(user=request.user)
            if lehrer.user.is_superuser:
                return qs
            return qs.filter(lehrer=lehrer)

    def formfield_for_foreignkey(self, db_field, request, **kwargs):
        if db_field.name == "lehrer_id":
            lehrer = Lehrer.objects.get(user=request.user)
            kwargs["queryset"] = Lehrer.objects.filter(lehrer=lehrer)
        return super().formfield_for_foreignkey(db_field, request, **kwargs)

        # class ProjectGroupMembershipInlineForm(forms.ModelForm):
        #   def __init__(self, *args, **kwargs):
        #   super(ProjectGroupMembershipInlineForm, self).__init__(*args, **kwargs)


#      self.fields['group'].queryset = Group.objects.filter(some_filtering_here=self.instance)

# class ProjectGroupMembershipInline(admin.StackedInline):
#
#   def formfield_for_foreignkey(self, db_field, request, **kwargs):
#     if db_field.name == "group":
#          try:
#            parent_obj_id = request.resolver_match.args[0]
#           kwargs["queryset"] = Group.objects.filter(some_filtering_here=parent_obj_id)
#      except IndexError:
#        pass
# return super(
#   ProjectGroupMembershipInline, self).formfield_for_foreignkey(db_field, request, **kwargs)

admin.site.site_header = 'Notenerfassungssystem '
admin.site.register(Note, NoteModel)
admin.site.register(Klasse)
admin.site.register(Lehrer)
admin.site.register(Schueler)
admin.site.register(Fach)
admin.site.register(Unterrichtet)
