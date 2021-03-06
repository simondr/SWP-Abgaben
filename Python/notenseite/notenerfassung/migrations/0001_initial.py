# Generated by Django 2.1.5 on 2019-03-14 14:47

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Fach',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=10)),
            ],
        ),
        migrations.CreateModel(
            name='Klasse',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=10)),
            ],
        ),
        migrations.CreateModel(
            name='Lehrer',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('first_name', models.CharField(max_length=20)),
                ('last_name', models.CharField(max_length=20)),
                ('password', models.CharField(max_length=50)),
                ('isAdmin', models.BooleanField()),
            ],
        ),
        migrations.CreateModel(
            name='Note',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('note', models.IntegerField()),
            ],
        ),
        migrations.CreateModel(
            name='Schueler',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('first_name', models.CharField(max_length=20)),
                ('last_name', models.CharField(max_length=20)),
                ('password', models.CharField(max_length=10)),
                ('klasse', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Klasse')),
            ],
        ),
        migrations.CreateModel(
            name='Unterrichtet',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('fach', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Fach')),
                ('klasse', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Klasse')),
                ('lehrer', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Lehrer')),
            ],
        ),
        migrations.AddField(
            model_name='note',
            name='fach',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Unterrichtet'),
        ),
        migrations.AddField(
            model_name='note',
            name='lehrer',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Lehrer'),
        ),
        migrations.AddField(
            model_name='note',
            name='schueler',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='notenerfassung.Schueler'),
        ),
    ]
