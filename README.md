This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

## Usage Instructions

To build and run the project, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/your-repo.git
   cd your-repo
   ```

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).

3. Build the project using Gradle:
   ```
   ./gradlew build
   ```

4. Run the desired target:
   - For Android: Run the `:composeApp:androidApp` task.
   - For iOS: Open the `iosApp` project in Xcode and run it.
   - For Desktop: Run the `:composeApp:desktopApp` task.
   - For Web: Run the `:composeApp:wasmJsBrowserDevelopmentRun` task.

## Examples

Here are some examples of how to use the project:

### Android

To run the Android app, connect an Android device or start an emulator, and run the following command:
```
./gradlew :composeApp:installDebug
```

### iOS

To run the iOS app, open the `iosApp` project in Xcode, select a target device or simulator, and click the Run button.

### Desktop

To run the Desktop app, use the following command:
```
./gradlew :composeApp:run
```

### Web

To run the Web app, use the following command:
```
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

## Contributing

We welcome contributions to the project! Please see the [CONTRIBUTING.md](CONTRIBUTING.md) file for guidelines on how to contribute.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

**Note:** Compose/Web is Experimental and may be changed at any time. Use it only for evaluation purposes.
We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.
