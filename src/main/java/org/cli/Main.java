package org.cli;

import org.cli.commands.Mkdir;
import org.cli.commands.Move;
import org.cli.commands.Remove;
import picocli.CommandLine;

@CommandLine.Command(name = "kata-cli", subcommands = {Move.class, Mkdir.class, Remove.class})
public class Main {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(Main.class);
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}