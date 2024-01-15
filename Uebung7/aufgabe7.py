import requests

bundesland = 'BW'

def get_holidays(year):
    url = f"https://feiertage-api.de/api/?jahr={year}&nur_land={bundesland}&nur_daten"
    response = requests.get(url)

    if response.status_code == 200:
        holidays_data = response.json()
        return holidays_data
    else:
        return None


year = 2023
holidays = get_holidays(year)

if holidays:
    holidays_string = str(holidays)
    holidays_string_with_linebreaks = holidays_string.replace(', ', '\n')
    print(f"Feiertage in {bundesland} im Jahr {year}:\n{holidays_string_with_linebreaks}")
else:
    print(f"Fehler beim Abrufen der Feiertage für das Jahr {year}")
