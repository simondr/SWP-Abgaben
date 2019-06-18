from django.db import models
from django.contrib.auth.models import User
from django.core.validators import MinValueValidator, MaxValueValidator


# Create your models here.


class Klasse(models.Model):
    name = models.CharField(max_length=10)

    def __str__(self):
        return self.name

    class Meta:
        verbose_name = "Klasse"
        verbose_name_plural = "Klassen"


class Lehrer(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)

    class Meta:
        verbose_name = "Lehrer"
        verbose_name_plural = "Lehrer"

    def __str__(self):
        return "{0} {1}".format(self.user.first_name, self.user.last_name)


class Fach(models.Model):
    name = models.CharField(max_length=10)

    def __str__(self):
        return self.name

    class Meta:
        verbose_name = "Fach"
        verbose_name_plural = "Fächer"


class Schueler(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    klasse = models.ForeignKey(Klasse, on_delete=models.CASCADE)

    def __str__(self):
        return "{0} {1}".format(self.user.first_name, self.user.last_name)

    class Meta:
        verbose_name = "Schüler"
        verbose_name_plural = "Schüler"


class Unterrichtet(models.Model):
    lehrer = models.ForeignKey(Lehrer, on_delete=models.CASCADE)
    klasse = models.ForeignKey(Klasse, on_delete=models.CASCADE)
    fach = models.ForeignKey(Fach, on_delete=models.CASCADE)

    def __str__(self):
        return self.lehrer.user.first_name + " unterrichtet " + self.klasse.name + " in " + self.fach.name

    class Meta:
        verbose_name = "Unterrichtet"
        verbose_name_plural = "Unterrichtet"


class Note(models.Model):
    schueler = models.ForeignKey(Schueler, on_delete=models.CASCADE)
    fach = models.ForeignKey(Unterrichtet, on_delete=models.CASCADE)
    note = models.IntegerField(validators=[MinValueValidator(1),
                                           MaxValueValidator(5)])
    lehrer = models.ForeignKey(Lehrer, on_delete=models.CASCADE)

    def __str__(self):
        return self.schueler.user.first_name + " " + self.schueler.user.last_name + " in " + self.fach.fach.name

    class Meta:
        verbose_name = "Noten"
        verbose_name_plural = "Noten"


Lehrer.klasse = models.ForeignKey(Unterrichtet, on_delete=models.CASCADE)
