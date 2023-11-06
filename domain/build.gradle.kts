plugins {
    kotlin(Plugins.Kotlin.jvm)
}

java {
    sourceCompatibility = Options.compileOptions
    targetCompatibility = Options.compileOptions
}

dependencies {
    implementation(project(mapOf("path" to ":app")))
    implementation(project(mapOf("path" to ":data")))

    // Javax Inject
    api(Libraries.Javax.inject)

    // Kotlin
    api(Libraries.Coroutines.core)

    // Paging
    implementation(Libraries.Paging.common)

    // Retrofit
    implementation(Libraries.Retrofit.retrofit)
    implementation(Libraries.Retrofit.converterMoshi)
    implementation(Libraries.Retrofit.gsonConverter)
}