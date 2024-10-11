# Contributing

To contribute, first make sure `main` is up to date by running `git pull origin main`.

You can then create a branch off of it following this convention: `dev-learner-kata`.

- If my kata was called `DiscoDance`, the branch would be `dev-charlie-disco-dance`.
- Once `main` is up to date, I would run `git checkout -b dev-charlie-disco-dance`.

Create your own kata and corresponding test class by placing the kata file in `src/main/java/org/cli/katas` and the test
file in `src/test/java/org/cli/katas`.

> [!IMPORTANT]  
> The test file must match the kata name with "Test" appended to it:  
> Kata: DiscoDance.java  
> Test: DiscoDanceTest.java

Once both files are created, you can use the move command to distribute them to each learner's directory in both:

- `src/main/java/org/kata/LEARNER-NAME`
- `src/test/java/org/kata/LEARNER-NAME`

This makes the kata and the kata test available to all learners :muscle: .

If you need to remove the kata and test files from these directories later, you can use the remove command to clean them
up from each learner’s subdirectory.

Once you are happy, add, commit, push, and create a PR for a PDE to review it.

## Using the CLI Commands

The CLI commands aim to make it simple and convenient to contribute katas and test files for everyone to complete.

### Move

The `move KataName.java` command automates moving a specified Java file from the `src/main/java/org/cli/katas` directory
to each learner's subdirectory in both:

- `src/main/java/org/kata/LEARNER-NAME`: The source directories.
- `src/test/java/org/kata/LEARNER-NAME`: The test directories.

It checks if the file already exists in each learner's destination directory, and if not, it copies the file and its
associated test file to the appropriate locations.

Any errors encountered during this process, such as missing files or IO issues, are logged, and existing files are
skipped to avoid overwriting.

```bash
./mvnw exec:java -Dexec.mainClass="org.cli.Main" -Dexec.args="move HelloWorld.java"
```

> [!IMPORTANT]
> The test file must match the kata name with "Test" appended to it:
> Kata: HelloWorld.java
> Test: HelloWorldTest.java

### Remove

The `remove KataName.java` command deletes a specified Java file from each learner's subdirectory in both:

- `src/main/java/org/kata/LEARNER-NAME`: The source directories.
- `src/test/java/org/kata/LEARNER-NAME`: The test directories.

It iterates over all learners and removes the file from their respective directories.

If the test file exists, it also removes the corresponding test file.

Errors, such as missing files, are handled by logging a message.

```bash
./mvnw exec:java -Dexec.mainClass="org.cli.Main" -Dexec.args="remove HelloWorld.java"
```

> [!IMPORTANT]
> It will not remove files from the source and test directories.

### Mkdir

The `mkdir` command reads a list of learners from a CSV file located at `src/main/resources/learners.csv` and creates
corresponding directories for each learner in both the source `src/main/java/org/kata/LEARNER-NAME` and test 
`src/test/java/org/kata/LEARNER-NAME` directories.

For each learner, subdirectories are created in these paths, and any errors, such as missing files or IO issues, are
handled with a simple error message.

```bash
./mvnw exec:java -Dexec.mainClass="org.cli.Main" -Dexec.args="mkdir"
```

---