# 📦 AtlasInventory – Kotlin Multiplatform App

**AtlasInventory** es una aplicación desarrollada en **Kotlin Multiplatform** utilizando **JetBrains Compose Multiplatform**.  
Este proyecto busca ofrecer una solución multiplataforma moderna para gestionar inventarios desde web, escritorio y móvil, todo desde una única base de código. 🌐📱🖥️

---

## 🧠 Objetivo del Proyecto

El objetivo principal de *AtlasInventory* es permitir la gestión de inventarios de manera eficiente, accediendo desde distintas plataformas, con una interfaz coherente, limpia y fluida.

---

## 🚀 Características

- 🔗 Base de código única para Android, Web y Desktop
- 🎨 UI construida con **JetBrains Compose**
- ⚡ Soporte experimental para **WebAssembly (WASM)**
- 📁 Código modular y limpio, siguiendo buenas prácticas de desarrollo multiplataforma

---

## 🛠️ Tecnologías Usadas

- **Kotlin Multiplatform**
- **JetBrains Compose Multiplatform**
- **Gradle Kotlin DSL**
- **WebAssembly (WASM)**
- **HTML/CSS** para assets web

---

## 📂 Estructura del Proyecto

├── composeApp/ # Código compartido y específico por plataforma │ ├── commonMain/ # Código común a todos los targets │ ├── androidMain/ # Código específico de Android │ ├── desktopMain/ # Código para versión de escritorio │ └── wasmJsMain/ # Versión web (WebAssembly) ├── gradle/ # Configuraciones Gradle ├── build.gradle.kts # Build principal ├── settings.gradle.kts # Configuración de módulos ├── README.md # Este archivo

---

## ▶️ Cómo Ejecutar

### 💻 Versión Web (WASM)

```bash
./gradlew :composeApp:wasmJsBrowserDevelopmentRun

