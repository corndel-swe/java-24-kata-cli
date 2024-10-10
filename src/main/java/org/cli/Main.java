package org.cli;

import org.cli.commands.Mkdir;
import org.cli.commands.Move;
import picocli.CommandLine;

@CommandLine.Command(name = "kata-cli", subcommands = {Move.class, Mkdir.class})
public class Main {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new Main());
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}