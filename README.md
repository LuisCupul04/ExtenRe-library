<p align="center">
  <picture>
    <source
      width="350px"
      media="(prefers-color-scheme: dark)"
      srcset="Logo/ExtenRe-Yellow.svg">
    <img src="Logo/ExtenRe-Yellow.svg" alt="ExtenRe Patcher Logo" width="350px">
  </picture>
</p>

# 📚 ExtenRe Library

![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/LuisCupul04/ExtenRe-library/release.yml)
![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)

Library containing common utilities for ExtenRe.

## ❓ About

ExtenRe Library powers projects such as [ExtenRe Manager](https://github.com/LuisCupul04/ExtenRe-manager),
[ExtenRe CLI](https://github.com/LuisCupul04/ExtenRe-cli) with common utilities and functionalities
by providing shared code.

## 💪 Features

Some of the features the ExtenRe Library provides are:

- 📝 **Signing APKs**: Read and write keystores, and sign APK files
- 🧩 **Common utility functions**: Various APIs for ExtenRe patches such as JSON serialization,
  reading and setting patch options, calculating the most common compatible version for a set of patches and more
- 💾 **Install and uninstall APKs**: Install and uninstall APK files via ADB or locally,
  the Android package manager, or by mounting using root permissions
- 📦 **Repackage patched files to an APK**: Apply patched files from
  [ExtenRe Patcher](https://github.com/LuisCupul04/ExtenRe-patcher) to an APK file, and align & sign the APK file automatically

## 🚀 How to get started

To use ExtenRe Library in your project, follow these steps:

1. [Add the repository](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry#using-a-published-package)
   to your project
2. Add the dependency to your project:

   ```kt
    dependencies {
        implementation("com.extenre:ExtenRe-library:{$version}")
    }
   ```

## 📚 Everything else

### 📙 Contributing

Thank you for considering contributing to ExtenRe Library.

### 🛠️ Building

To build ExtenRe Library,
you can follow the [ExtenRe documentation](https://github.com/LuisCupul04/ExtenRe-documentation).

## 📜 Licence

ExtenRe Library is licensed under the GPLv3 license. Please see the [licence file](LICENSE) for more information.
[tl;dr](https://www.tldrlegal.com/license/gnu-general-public-license-v3-gpl-3) you may copy, distribute and modify ExtenRe Library as long as you track changes/dates in source files.
Any modifications to ExtenRe Library must also be made available under the GPL,
along with build & install instructions.
