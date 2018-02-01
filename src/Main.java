public class Main {

    // The program takes a minimal assembly language program, and runs the first steps of a preprocessor / translator
    // (compiler or assembler): removing comments and checking for syntax errors.  Your program processes the code, and
    // creates a log file with error messages (if any) and a comments-removed listing of the code.

    public static void main(String[] args) {
        // Open (input) MAL program file and log (output) file
            // Create the log file in the same location

        // For each MAL program line...
            // Read line

            // If not a blank line and not a comment line...
                // Write line to log file, with sequence number and without any online comment

            // Check errors (in order below), stopping at first error on that line
                // 1) Ill-formed label: first token ends in a colon but doesn't follow rules for a label name

                // 2) Invalid opcode: first non-comment string (token) found on a line is not one of the valid opcodes
                    // Exception: if line contains a label, then opcode should be second token

                // 3) Too many operands: for the specific opcode, there are more operands than expected
                    // You may assume that any operands on the line are in a valid, comma-seperated list for this
                    // the next error

                // 4) Too few opcode: for the specific opcode, there are fewer operands than expected

                // 5) Ill-formed operands: an operand name (id or register) is invalid, or an immediate value is
                // for octal

                // 6) Wrong operand type: Number where id expected, or vice versa

                // 7) Label warnings: a branch goes to a non-existent label, or there is a label that is never
                // branched to

        // Detection of an error on a line halts processing on that line (don't scan for further errors)

        // Write error message (if any) to log file

        // Write summary data to log file

        // Close files

    }
}
