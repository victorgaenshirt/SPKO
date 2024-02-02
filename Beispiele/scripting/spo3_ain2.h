/*
 * spo3_ain2.h
 *
 * Enthaelt die gueltigen Facher und Noten.
 *
 * Autor: H.Drachenfels
 * Erstellt am: 29.11.2019
 */

#ifndef SPO3_AIN2_H
#define SPO3_AIN2_H

#include <stdbool.h>

#define SPO_BESTE_NOTE 10
#define SPO_SCHLECHTESTE_NOTE 50
#define AIN2_ANZAHL_LEISTUNGEN 11

bool ist_spo_note(int);
bool ist_ain2_modul(const char *);

#endif

