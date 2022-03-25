# Inshort
# About:-
This is News App.Where User can read top 100 news relative to the Entertainment, Sports, Science, Technology, Health etc.
# Tech stack:-
Android SDK, Retrofit, Coroutine , LiveData and Android pattern(MVVM) ,Kotlin
# Dependency of the Project:-
   //Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation "com.squareup.okhttp3:logging-interceptor:4.7.2"
    //LiveData and ViewModel
    def arch_version = '2.2.0-alpha01'
    implementation "androidx.lifecycle:lifecycle-extensions:$arch_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$arch_version"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'

    implementation("com.squareup.okhttp3:logging-interceptor:3.9.0")

    //Glide
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    //Picasso Library
    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'com.android.support:multidex:1.0.3'
