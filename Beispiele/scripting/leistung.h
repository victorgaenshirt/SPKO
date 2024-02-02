/*
 * leistung.h
 *
 * Datenstruktur und Funktionen zum Speicher, Einlesen und Ausgeben
 * eines Fachnamens mit Beurteilung.
 *
 * Autor: H.Drachenfels
 * Erstellt am: 29.11.2019
 */

#ifndef LEISTUNG_H
#define LEISTUNG_H

#include <stdbool.h>

#define MAX_MODUL 20

enum leistungsart {benotet, unbenotet};

struct leistung
{
    char modul[MAX_MODUL + 1];

    enum leistungsart art;
    union
    {
        int note;    /* Noten 10, ..., 40, 50 */
        char status; /* 'B' = bestanden, 'N' = nicht bestanden */
    };
};

typedef struct leistung leistung;

bool leistung_einlesen(leistung *);
void ausgeben(const leistung*);

#endif

