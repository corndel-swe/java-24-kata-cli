# Katas

A coding kata is a practice exercise to improve programming skills through repetition, syntax application, and
problem-solving.

Since we have a group of nine developers, it makes sense to make the katas public and share the different approaches to
solving each problem.

Given that we have nine developers, if each of us adds at least one kata and test to the project, we will have quite a
bank of katas to work through.

It also gives Charlie a break :blush: .

## Set Up

1. You will need to clone the repository.

    ```bash
    # HTTPS
    git clone https://github.com/corndel-swe/java-24-kata-cli.git
    
    # SSH
    git clone git@github.com:corndel-swe/java-24-kata-cli.git
    
    cd java-24-kata-cli
    ```

2. Use the Maven wrapper to add project dependencies.

    ```bash
    ./mvnw clean compile
    ```

3. If you are solving a kata, make sure you are on the `learner-name-solutions` branch, as the `main` branch is protected and cannot
   be pushed to.

    ```bash
    git checkout learner-name-solutions
    ```

> [!INFO]  
> Your `learner-name-solutions` branch will need a PR open to be added to main. At the end of the day, each PR will be merged into
`main`.

### How to Start Solving

Make sure you are on your own `learner-name-solutions` branch and it is up to date: `git pull origin main`.

To start solving a kata, navigate to the `src/main/java/org/kata` directory, where you will find a directory named after
you.

Inside your learner directory, you'll find the kata classes assigned to you. Each will have a brief for you to
follow/implement.

Begin by working on these kata challenges to develop your understanding of Java and your ability to solve problems with
Java.

The corresponding test cases for each kata are located in the `src/test/java/org/kata` folder, under your learner
directory.

Use these test files to verify that your solution works as expected. Running the tests regularly will ensure your code
meets the requirements.

Remove the `@Disabled` annotation to enable the other test cases.

### How to Contribute

If you are interested in the CLI package or adding a kata and kata test, and I’m sure you are, head over
to [CONTRIBUTING](./CONTRIBUTING.md) to see how you can get involved.

---
