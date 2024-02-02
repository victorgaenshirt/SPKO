/*
 * leistung.c
 *
 * implmentiert das Einlesen und Ausgeben von Leistungen.
 *
 * Autor: H.Drachenfels
 * Erstellt am: 29.11.2019
 */

#include "leistung.h"
#include "spo3_ain2.h"

#include <stdio.h>
#include <string.h>

static void ausgeben_benotet(int);
static void ausgeben_unbenotet(char);

bool leistung_einlesen(leistung *p)
{
    if (scanf("%20s", p->modul) != 1)
    {
        return false;
    }

    char *s = p->modul;
    while ((s = strchr(s, '_')) != NULL)
    {
        *s = ' ';
    }

    int n;
    if ((n = scanf("%d", &p->note)) == 1)
    {
        p->art = benotet;
    }
    else if (n == 0 && scanf("%c",  &p->status) == 1)
    {
        p->art = unbenotet;
    }
    else
    {
        return false;
    }

    return true;
}

void ausgeben(const leistung *p)
{
    if (!ist_ain2_modul(p->modul))
    {
        printf("Fehler: %s\n", p->modul);
        return;
    }

    printf("%-*s\t", MAX_MODUL,  p->modul);

    switch (p->art)
    {
    case benotet:
        ausgeben_benotet(p->note);
        break;
    case unbenotet:
        ausgeben_unbenotet(p->status);
        break;
    default:
        fprintf(stderr, "Fehler: unbekannte Leistungsart %d\n", p->art);
    }
}

static void ausgeben_benotet(int note)
{
    if (ist_spo_note(note))
    {
        printf("L\t%d,%d\n", note / 10, note % 10);
    }
    else
    {
        printf("L\tFehler: %d\n", note);
    }
}

static void ausgeben_unbenotet(char status)
{
    switch (status)
    {
    case 'B':
        printf("S\tbestanden\n");
        break;
    case 'N':
        printf("S\tnicht bestanden\n");
        break;
    default:
        printf("S\tFehler: %c\n", status);
    }
}

