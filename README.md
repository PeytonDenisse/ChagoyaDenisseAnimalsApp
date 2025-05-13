# 🐾 ChogoyaDenisseAnimalsApp
Denisse Chogoya
5° Semestre – ISSC
Desarrollo de Aplicaciones Móviles

Aplicación Android construida con **Jetpack Compose** para visualizar animales y sus hábitats a través del consumo de una API REST.


## 🚀 Cómo ejecutar el proyecto
1. Clona el repositorio:
-- git clone https://github.com/tu_usuario/ChogoyaDenisseAnimalsApp.git
2. Abre el proyecto en Android Studio.
3. Ejecuta en un emulador o dispositivo Android.


## 🌐 API utilizada

**Base URL:** `https://animals.juanfrausto.com/api/`

| Endpoint                         | Uso                                              |
|----------------------------------|--------------------------------------------------|
| `/animals`                      | Obtener lista completa de animales               |
| `/animals/{id}`                | Obtener detalles de un animal                    |
| `/animals?enviromentId={id}`   | Animales que viven en un hábitat específico      |
| `/environments`                | Lista de hábitats                                |
| `/environments/{id}`           | Detalles de un hábitat específico                |




## 📌 Funcionalidades principales

La aplicación cuenta con **4 pantallas**:

### 🐾 Pantalla 1: Lista de Animales
Ruta: `"animals"`

- Consulta: `GET https://animals.juanfrausto.com/api/animals`
- Muestra:
  - Imagen principal del animal (`animal.image`)
  - Nombre del animal (`animal.name`)
- Componente usado: `AnimalItemCard`
- Navegación al hacer clic: `animal_detail/{id}`

---

### 🌎 Pantalla 2: Lista de Ambientes
Ruta: `"habits"`

- Consulta: `GET https://animals.juanfrausto.com/api/environments`
- Muestra:
  - Imagen del ambiente (`environment.image`)
  - Nombre del ambiente (`environment.name`)
- Componente usado: `EnvironmentItemCard`
- Navegación al hacer clic: `environment_detail/{id}`

---

### 📋 Pantalla 3: Detalle del Animal
Ruta: `"animal_detail/{id}"`

- Consulta: `GET https://animals.juanfrausto.com/api/animals/{id}`
- Muestra:
  - Imagen principal
  - Nombre del animal
  - Descripción (`animal.description`)
  - Galería horizontal (`animal.imageGallery`)
  - Lista de hechos curiosos (`animal.facts`)
- Componente adicional: `FactItem` (diseño decorativo de burbuja)

---

### 🏞️ Pantalla 4: Detalle del Ambiente
Ruta: `"environment_detail/{id}"`

- Consulta 1: `GET https://animals.juanfrausto.com/api/environments/{id}` → muestra la información del ambiente
- Consulta 2: `GET https://animals.juanfrausto.com/api/animals?enviromentId={id}` → filtra animales por hábitat
- Muestra:
  - Imagen principal del hábitat
  - Descripción
  - Lista de animales en ese ambiente (usando `AnimalItemCard`)

---




## 🔀 Navegación

La navegación está implementada con **Navigation Compose**, mediante un `NavHost` central con las siguientes rutas:

```kotlin
NavHost(navController, startDestination = "animals") {
    composable("animals") { AnimalsScreen(...) }
    composable("habits") { HabitsScreen(...) }
    composable("animal_detail/{id}") { ... }
    composable("environment_detail/{id}") { ... }
}
```

## 📦 Estructura del Proyecto

ChogoyaDenisseAnimalsApp/

┣ 📁 components/ → Tarjetas y componentes reutilizables

┣ 📁 models/ → Clases de datos: Animal, Environment

┣ 📁 screens/ → Todas las pantallas principales

┣ 📁 services/ → Retrofit + Endpoints API

┣ 📄 MainActivity.kt → Configuración de Scaffold y navegación

┗ 📄 README.md → Este documento



