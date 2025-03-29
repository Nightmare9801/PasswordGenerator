# PasswordGenerator

A Java-based password generator that allows users to create secure passwords with customizable character sets. Whether you need a password for general use or a custom configuration with a specific mix of uppercase letters, lowercase letters, digits, and symbols, this tool has you covered.

## Features

- **Customizable Passwords**: Generate passwords by specifying the number of uppercase letters, lowercase letters, digits, and symbols.
- **General Use Option**: Quickly generate a default secure password for everyday use.
- **Command Line Interface (CLI)**: Interactive text-based UI for easy configuration.
- **Randomized Output**: Uses Java's `Random` and `Collections.shuffle()` for a well-distributed and secure password.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later installed on your machine.
- Basic understanding of compiling and running Java programs from the command line.

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Nightmare9801/PasswordGenerator.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd PasswordGenerator
   ```

## Compilation

Compile the Java source files. For example, if your source files are in the `src` folder:

  ```bash
  javac -d bin src/generator/*.java
  ```

This command compiles the Java files in the generator package and places the .class files into a bin directory.

## Project Structure

PasswordGenerator/
├── src/
│   └── generator/
│       ├── Generator.java    // Core logic for generating passwords
│       └── TUI.java          // CLI-based user interface for password generation
├── bin/                    // Compiled .class files
└── README.md               // Project documentation


## Usage
- General Use Option:
  - When prompted, select option 1 to generate a default password with pre-configured parameters.

- Custom Option:
  - Select option 2 to enter custom parameters.

  - Input the desired number of uppercase letters, lowercase letters, digits, and symbols.

The tool will generate and display a secure password based on your input.

## Contributing
Contributions are welcome! If you have any suggestions, bug reports, or improvements, please feel free to fork the repository and submit a pull request.

## License
This project is open-source. See the LICENSE file for more details.
