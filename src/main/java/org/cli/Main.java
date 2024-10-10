package org.cli;

import picocli.CommandLine;

@CommandLine.Command(name="kata-cli", subcommands = {Move.class, Mkdir.class} )
public class Main {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new Main());
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}