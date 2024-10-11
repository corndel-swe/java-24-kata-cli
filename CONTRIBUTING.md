# Contributing

To contribute, you can create your branch then create own Kata and corresponding test class by placing the Kata file in
src/cli/kata and the test file in test/cli/kata.

Once both files are created, you can use the move command to distribute them to each learner's directory in both

- src/main/java/org/kata/LEARNER
- src/test/java/org/kata/LEARNER

Making the kata and kata test available to all learners.

If you need to remove the kata and test files from these directories later, you can use the remove command to clean them
up from each learner’s subdirectory.

Once you are happy create a PR and get a PDE to review it.

## Using the CLI Commands

### Move

The `move KataName.java` command automates moving a specified Java file from the `src/main/java/org/cli/katas` directory
to each learner's subdirectory in both

- The source (`src/main/java/org/kata/LEARNER`) directories.
- The test (`src/test/java/org/kata/LEARNER`) directories.

It checks if the file already exists in each learner's destination directory, and if not, it copies the file and its
associated test file to the appropriate locations.
Any errors encountered during this process, such as missing files or IO issues, are logged, and existing files are
skipped to avoid overwriting.

```bash

```

### Remove

The `remove KataName.java` command deletes a specified Java file from each learner's subdirectory in both

- The source (src/main/java/org/kata/LEARNER) directories.
- The test (src/test/java/org/kata/LEARNER) directories.

It iterates over all learners and removes the file from their respective directories. If the test file exists, it also
removes the corresponding test file.
Errors, such as missing files, are handled by logging a message.

```bash

```

### Mkdir

The `mkdir` command reads a list of learners from a CSV file (`src/main/resources/learners.csv`) and creates
corresponding directories for each learner in both the source (`src/main/java/org/kata/LEARNER`) and test (
`src/test/java/org/kata/LEARNER`) directories. For each learner, subdirectories are created in these paths, and any
errors, such as missing files or IO issues, are handled with a simple error message.

```bash

```

---