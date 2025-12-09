# MobileAppTP

# WireMock – Prérequis pour les tests

Les tests end-to-end nécessitent un mock d'API local via **WireMock** exécuté dans Docker.

## 📦 Prérequis

- **Docker Desktop** installé et en cours d’exécution
- Un dossier WireMock contenant :
  - `mappings/pokemon.json`
  - `__files/pokemon-pikachu.json`

## 📁 Structure des fichiers


## 📄 `mappings/pokemon.json`

```json
{
  "request": {
    "method": "GET",
    "urlPattern": "/api/v1/pokemon/.*"
  },
  "response": {
    "status": 200,
    "headers": {
      "Content-Type": "application/json"
    },
    "bodyFileName": "pokemon-pikachu.json"
  }
}

{
  "name": { "fr": "Pikachu" },
  "category": "Souris",
  "sprites": {
    "regular": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"
  }
}
```


## Run le container docker

```bash
docker run --rm -it -p 8080:8080 -v "E:/wiremock/mappings:/home/wiremock/mappings" -v "E:/wiremock/__files:/home/wiremock/__files" wiremock/wiremock:latest
