/*
 * spo3_ain2.c
 *
 * Enthaelt die gueltigen Facher und Noten.
 *
 * Autor: H.Drachenfels
 * Erstellt am: 29.11.2019
 */

#include "spo3_ain2.h"
#include <string.h>

bool ist_ain2_modul(const char *modul)
{
    static const char *module[] =
    {
        "Mathematik 2",
        "Stochastik",
        "Programmiertechnik 2",
        "Systemprogrammierung",
        "Rechnerarchitekturen"
    };
    static const int anzahl_module = sizeof module / sizeof * module;

    for (int i = 0; i < anzahl_module; ++i)
    {
        if (strcmp(modul, module[i]) == 0)
        {
            return true;
        }
    }

    return false;
}

bool ist_spo_note(int note)
{
    switch (note)
    {
    case 10:
    case 13:
    case 17:
    case 20:
    case 23:
    case 27:
    case 30:
    case 33:
    case 37:
    case 40:
    case 50:
        return true;
    default:
        return false;
    }
}

