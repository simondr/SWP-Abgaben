from django.shortcuts import render, redirect
from django.contrib.auth.forms import AuthenticationForm
from django.contrib.auth import login, authenticate
from .models import Schueler, Lehrer


# Create your views here.

# def schueler(request):
#    return render(request, 'notenerfassung/schueler.html', )


# def lehrer(request):
#    return render(request, 'notenerfassung/lehrer.html', )


# def login_request(request):
#    if request.method == "POST":
#        form = AuthenticationForm(request, data=request.POST)
#        if form.is_valid():
#            username = form.cleaned_data.get('username')
#            password = form.cleaned_data.get('password')
#            user = authenticate(username=username, password=password)
#            schueler = Schueler.objects.filter(user=user)
#            lehrer = Lehrer.objects.filter(user=user)
#            print(schueler)
#            print(lehrer)
#           if user is not None:
#              login(request, user)
#             if schueler.exists():
#                return redirect("admin/")
#          if lehrer.exists():
#               return redirect("admin/")
#
#   form = AuthenticationForm()
#  return render(request,
#               "notenerfassung/login.html",
#              {"form": form})


