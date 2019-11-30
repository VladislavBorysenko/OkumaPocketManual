package com.example.listexample;

import java.util.ArrayList;
import java.util.List;

public class Alarms {
    public static List<AlarmItem> getListData() {

        List<AlarmItem> list = new ArrayList<AlarmItem>();
        AlarmItem BUS_ERROR = new AlarmItem("0001", "BUS ERROR",
                " This alarm is caused when the bus error exception has occurred\n" +
                        "       in the CPU.\n" +
                        "       When the bus error occurs, the CPU status is displayed in\n" +
                        "       hexadecimal numbers.\n" +
                        "       At the same time, the red LED at the CPU rack lights up.\n" +
                        "       The bus error includes the following five types of errors:\n" +
                        "       3)Cycle time over error\n" +
                        "       4)ECC error\n" +
                        "       5)Protect error\n" +
                        "       6)Loop error\n" +
                        "       7)Double-bus error\n" +
                        "       Note:\n" +
                        "       Error display is not available in the case of double-bus error.\n" +
                        "       [Object] None\n" +
                        "       [Code] CPU status\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Printed circuit boards\n" +
                        "        Mother board\n" +
                        "        Contact failure of card edge connector\n" +
                        "        Contact failure of flat cable\n" +
                        "        Switch settings\n" +
                        "       [Measures to Take]\n" +
                        "       Depending on the type of error encountered, check the following\n" +
                        "       points.\n" +
                        "       1)ECC error -> Main board, memory board\n" +
                        "       2)Protect error -> Main board\n" +
                        "       3)Cycle timer over error -> Judge the faulty PCB from the\n" +
                        "         access address.\n" +
                        "       4)Loop error -> PCB which generates the interruption in\n" +
                        "         question; judge the interruption\n" +
                        "         level from the status register.\n" +
                        "       5)System bus error -> All the main boards\n" +
                        "       6)Double-bus error -> All the PCB's\n" +
                        "       Then, carry out the following steps.\n" +
                        "       1)Check the switch settings.\n" +
                        "         Make sure that the boards are free of foreign material.\n" +
                        "         Make sure that flat cables are inserted securely.\n" +
                        "       2)Change the PCB inserting positions to see if there is any\n" +
                        "         change in the error status.\n" +
                        "       3)Replace the suspicious boards.");

        AlarmItem ADDRESS_ERROR = new AlarmItem("0002", "ADDRESS ERROR",
                "This error occurs when the CPU has accessed word operands, long\n" +
                        "       word operands or instructions by an odd number address.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        AlarmItem ILLEGAL_INSTRUCTION_ERROR = new AlarmItem("0003", "ILLEGAL INSTRUCTION ERROR",
                "his error occurs when the CPU has read an improper\n" +
                        "       instruction.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] None\n" +
                        "       [Measures to Take] None ");

        AlarmItem ZERO_DIVIDE_ERROR = new AlarmItem("0004", "ZERO DIVIDE ERROR",
                "This error occurs when the CPU executes a division command\n" +
                        "       with a divisor of \"0\".\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem CHK_INSTRUCTION_ERROR = new AlarmItem("0005", "CHK INSTRUCTION ERROR",
                "This error occurs when the CPU executes the CHK instruction\n" +
                        "       under certain conditions (such that the register value is less\n" +
                        "       than 0 or that the register value is greater than the upper\n" +
                        "       limit in the operand word.).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem TRAPV_INSTRUCTION_ERROR = new AlarmItem("0006", "TRAPV INSTRUCTION ERROR",
                "This error occurs when the overflow condition bit is turned on\n" +
                        "       in the status register when the TRAPV instruction is executed\n" +
                        "       by the CPU.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem PRIVILEGE_VIOLATION_ERROR = new AlarmItem("0007", "PRIVILEGE VIOLATION ERROR",
                "This error occurs when the CPU executes a privilege instruction\n" +
                        "       (instructions that can be executed only in the supervisor\n" +
                        "       condition) in the user condition.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        AlarmItem TRACE_ERROR = new AlarmItem("0008", "TRACE ERROR",
                "This error occurs when the CPU executes an instruction in the\n" +
                        "       trace condition.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        AlarmItem LINE_1010_EMULATOR_ERROR = new AlarmItem("0009", "LINE 1010 EMULATOR ERROR",
                "This error occurs when the CPU executes a command starting with\n" +
                        "       \"A\"(A***).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem LINE_1111_EMULATOR_ERROR = new AlarmItem("0010", "LINE 1111 EMULATOR ERROR",
                "This error occurs when the CPU executes a command starting with\n" +
                        "       \"F\"(F***).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem EXCEPTION_VECTOR_ERROR = new AlarmItem("0011", "EXCEPTION VECTOR ERROR",
                " This error occurs when the CPU has referenced the exception\n" +
                        "       vector which is not referenced normally.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem SPURIOUS_INTERRUPT_ERROR = new AlarmItem("0012", "SPURIOUS INTERRUPT ERROR",
                "This error occurs when a spurious interruption to the CPU has\n" +
                        "       been made.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem INTERRUPT_ERROR = new AlarmItem("0013", "INTERRUPT ERROR",
                "This error occurs when an unusual interruption to the CPU has\n" +
                        "       been made.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        All the printed circuit boards which generate interruption\n" +
                        "        Error in setting interruption level\n" +
                        "       [Measures to Take]\n" +
                        "        Check the setting of interruption level setting switches at\n" +
                        "        individual printed circuit boards.\n" +
                        "        Judge the interruption level from the value at the status\n" +
                        "        register (SR) when an error has occurred.\n" +
                        "        The third digit from the rightmost digit indicates the on\n" +
                        "        level.\n" +
                        "        Replace the printed circuit board which generates the judged\n" +
                        "        interruption.\n" +
                        "        Replace the main board.\n" +
                        "        Replace the mother board. ");

        AlarmItem TRAP_INSTRUCTION_ERROR = new AlarmItem("0014", "TRAP INSTRUCTION ERROR",
                " This error occurs when the CPU has referenced the TRAP\n" +
                        "       exception vector which is not referenced normally.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem USER_INTERRUPT_ERROR = new AlarmItem("0015", "USER INTERRUPT ERROR",
                "This error occurs when unusual user interruption has occurred.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem COPROCESSOR_ROTOCOL_ERROR = new AlarmItem("0016", "COPROCESSOR PROTOCOL ERROR",
                "This error occurs when communication fails between the CPU and\n" +
                        "       the coprocessor.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FORMAT_ERROR = new AlarmItem("0017", "FORMAT ERROR",
                "This error occurs when the CPU detects an improper value as a\n" +
                        "       result of data check required for operation control.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem UNINITIALIZED_INTERRUPT_ERROR = new AlarmItem("0018", "UNINITIALIZED INTERRUPT ERROR",
                "This error occurs when an interruption occurs before\n" +
                        "       initialization of the vector number for a peripheral device.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_UNDEFINED_CONDITION_ERROR = new AlarmItem("0019", "FPCP UNDEFINED CONDITION ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of a comparison command with non-numerals.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_INEXACT_RESULT_ERROR = new AlarmItem("0020", "FPCP INEXACT RESULT ERROR",
                "his error occurs when the floating-point coprocessor loses\n" +
                        "       some digits in arithmetic operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_IVIDE_BY_ZERO_ERROR = new AlarmItem("0021", "FPCP DIVIDE BY ZERO ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       division by a number having a denominator of \"0\" in execution\n" +
                        "       of a division command.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_UNDERFLOW_ERROR = new AlarmItem("0022", "FPCP UNDERFLOW ERROR",
                "This error occurs when the floating-point coprocessor obtains\n" +
                        "       a value too small to express as a result of arithmetic\n" +
                        "       operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_OPERAND_ERROR = new AlarmItem("0023", "FPCP OPERAND ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of an arithmetic statement which has no solution.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_OVERFLOW_ERROR = new AlarmItem("0024", "FPCP OVERFLOW ERROR",
                "This error occurs when the floating-point coprocessor obtains\n" +
                        "       a value too large to express as a result of arithmetic\n" +
                        "       operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem FPCP_SIGNALING_NAN_ERROR = new AlarmItem("0025", "FPCP SIGNALING NAN ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of an arithmetic statement contains signaling\n" +
                        "       non-numerals.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        AlarmItem DEVICE_NAME = new AlarmItem("0100", "DEVICE NAME", "Wrong device name is designated.\n" +
                "       Or a device name designated for renaming differs from the\n" +
                "       source device name.\n" +
                "       [Character-string] Designated device name or None\n" +
                "       [Code]\n" +
                "       1->Mismatch of device names before and after renaming\n" +
                "       None->Cases other than \"code 1\".\n" +
                "       [Probable Faulty Locations]\n" +
                "       Error in spelling of the input device name\n" +
                "       Designation of device name whose use is not allowed.\n" +
                "       Designation of device name differing from the source device\n" +
                "       name (RENAME command)\n" +
                "       [Measures to Take]\n" +
                "       Refer to the operation manual.\n" +
                "       In the RENAME operation, designation of device name for\n" +
                "       the changed name is not required.");

        AlarmItem SECTOR_DEVICE_NAME = new AlarmItem("0101", "SECTOR_DEVICE_NAME",
                "As one of the parameters to be transferred to the sector\n" +
                        "       device or driver routine, the device name which is not allowed\n" +
                        "       as a sector device name is designated.\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF-> The device name that a region has not been decided\n" +
                        "       \t   was designated.\n" +
                        "       None-> The device name which is not allowed as a sector device\n" +
                        "              name was designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Information on the sector device name is destroyed.\n" +
                        "       2)The partition map of the memory disk is destroyed.\n" +
                        "       3)The device name which is not allowed as a sector device\n" +
                        "         name was designated.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the user memory information in VID of the memory disk.\n" +
                        "       2)Please designate a device name of a normal discharge as a\n" +
                        "         sector device name.\n" +
                        "       [Related Specifications] OSP file structur");

        AlarmItem PRINT_DEVICE_NAME = new AlarmItem("0102", "PRINT DEVICE NAME",
                "In one of the parameters to be transferred to the printer\n" +
                        "       driver routine, an illegal device name is designated as\n" +
                        "       the print device name.\n" +
                        "       [Character-string] Designated device name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The content of the variable PPRDV4 for print device name is\n" +
                        "       destroyed.");

        AlarmItem FILE_NAME = new AlarmItem("0105", "FILE NAME",
                " Characters \"*\" and \"?\" are used for a command not allowed\n" +
                        "       a file name. Or either or both of the file name and\n" +
                        "       the extension are omitted in the setting of default file name\n" +
                        "       for the USE command.\n" +
                        "       [Character-string] Designated file name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the complete file name designation (except default),\n" +
                        "       characters\"*\" and \"?\" have been used.\n" +
                        "       File name and/or extension has been omitted in setting the\n" +
                        "       default file name for the USE command.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        AlarmItem COMMAND_CHARACTER = new AlarmItem("0106", "COMMAND CHARACTER",
                "A command not in the command table has been designated.\n" +
                        "       [Character-string]\n" +
                        "       Command characters which have been input.\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Spelling error of a command\n" +
                        "       Input of a command not allowed in the mode currently selected\n" +
                        "       [Measures to Take]\n" +
                        "       Input the command using function keys.\n");

        AlarmItem COMMAND_SYNTAX = new AlarmItem("0107", "COMMAND SYNTAX",
                "Syntax error of commands\n" +
                        "       [Character-string] Designated command\n" +
                        "       [Code]\n" +
                        "       1->Delimiter is not \",\".\n" +
                        "       2->A command contains more than 8 characters.\n" +
                        "       3->A device name contains more than 3 characters.\n" +
                        "       4->A device name does not end with a colon \":\".\n" +
                        "       5->A file name contains more than 19 characters.\n" +
                        "       6->A file name contains characters other than alphanumeric\n" +
                        "          characters, and symbols \"*\", \"?\" and \"-\".\n" +
                        "       7->The first character of a file name or extension is other\n" +
                        "          than an alphabetic character, and symbols \"*\" and \"?\".\n" +
                        "       8->The option specification contains more than 16 characters\n" +
                        "          (\";\" not counted).\n" +
                        "       $21->Hexadecimal data contains more than 8 digit figures.\n" +
                        "       $22->Decimal data contains more than 10 digit figures.\n" +
                        "       $23->Decimal data contains more than 4 digit figures.\n" +
                        "       $24->Delimiter is not \"-\".\n" +
                        "       $25->Numerical value of hexadecimal data is wrong.\n" +
                        "       $26->The first alphabetic character is wrong.\n" +
                        "       $27->Delimiter is not \"=\".\n" +
                        "       $28->Hexadecimal data contains more than 2 digit or 3 digit\n" +
                        "            figures.\n" +
                        "       $29->Register name is wrong.\n" +
                        "       $2A->Surplus data is still used.\n" +
                        "       $2B->Delimiter is not \",\".\n" +
                        "       $2C->Trace register too much\n" +
                        "       $2D->Trace memory too much\n" +
                        "       $2E->Hexadecimal data is not an even number.\n" +
                        "       $2F->Hexadecimal data contains more than 2 digit figures.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Input has been made by decimal number although hexadecimal\n" +
                        "       number should be used.\n" +
                        "       In the word size designation, an odd number address has been\n" +
                        "       designated.\n" +
                        "       Input has been made mistakenly.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        AlarmItem OPTION = new AlarmItem("0108", "OPTION",
                "Wrong option characters have been designated.\n" +
                        "       [Character-string] Commanded option\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       An option not usable with the command designated has been\n" +
                        "       designated.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        AlarmItem FILE_ATTRIBUTE = new AlarmItem("0110", "FILE ATTRIBUTE",
                "An attempt is made to read a file other than sequential file\n" +
                        "       and contiguous file. Or an attempt is made to read\n" +
                        "       a contiguous file in the sequential file reading processing,\n" +
                        "       or to read a sequential file in the contiguous file reading\n" +
                        "       processing.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Attribute code of the file to be read\n" +
                        "       1->Contiguous file\n" +
                        "       2->Sequential file\n" +
                        "       Others->Unknown file\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Contiguous file has been designated in the list display,\n" +
                        "       editing and other processing.\n" +
                        "       File directory of the memory, floppy disk, etc. has been\n" +
                        "       destroyed. During multi-task execution, directory of other\n" +
                        "       file has been read by other task.\n" +
                        "       Part program file has been designated in reading the control\n" +
                        "       program file.");

        AlarmItem DEVICE_FULL = new AlarmItem("0111", "DEVICE FULL",
                "Available storage area size of the designated device is\n" +
                        "       smaller than the required number of sectors.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Necessary number of remaining sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Available area is not actually sufficient.\n" +
                        "       SAT sector information of the device has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Delete unnecessary files.\n" +
                        "       Check the available area size with the FREE command.\n" +
                        "       Subtract the sizes of files registered from the device memory\n" +
                        "       capacity and compare it with the data displayed for FREE\n" +
                        "       command.");

        AlarmItem DISK_UNINITIALIZED = new AlarmItem("0112", "DISK UNINITIALIZED",
                "The floppy disk is not initialized to the OSP format.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk or memory formatted to other format\n" +
                        "       (EXORMACS, IBM, etc.)\n" +
                        "       Contents of VID of floppy disk or memory have been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       To use an IBM format floppy disk, change the setting.\n" +
                        "       Check the contents at sector 0 (VID).\n" +
                        "       Usually, new floppy disks are formatted to IBM format.\n" +
                        "       Therefore, initialize the disk to the OSP format using\n" +
                        "       the INIT command.");

        AlarmItem ERROR_MAP_INFORMATION = new AlarmItem("0114", "ERROR-MAP INFORMATION",
                "Wrong sector identification name for error map information\n" +
                        "       (containing faulty track information) of the IBM-formatted\n" +
                        "       floppy disk.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       0->Wrong sector identification name\n" +
                        "       1->Wrong data of faulty track\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Error map information sector has been destroyed.\n" +
                        "       [Measure\ts to Take]\n" +
                        "       Check the contents of the error map sector.");

        AlarmItem SVCL = new AlarmItem("0118", "SVCL",
                "The NC control software issued an undefined system call\n" +
                        "       (SVCL).\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Address near the wrongly called address\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Wrong control software is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Check and change the control software.");

        AlarmItem MEMORY_DISK_ACCESS_SECTOR_OVER = new AlarmItem("0124", "MEMORY DISK ACCESS SECTOR OVER",
                "Reading from or writing to the memory disk (MD) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for the\n" +
                        "       actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        AlarmItem MEMORY_DISK_ROM_ACCESS = new AlarmItem("0125", "MEMORY DISK ROM ACCESS",
                "Reading from or writing to the memory disk (FR) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for\n" +
                        "       the actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        AlarmItem DMA_TRANSFER_SECTOR_OVER = new AlarmItem("0126", "DMA TRANSFER SECTOR OVER",
                "In one of the parameters to be transferred to the driver\n" +
                        "       routine of the memory or the floppy disk, 0 or a value over 8\n" +
                        "       is designated as the number of sectors to be accessed at\n" +
                        "       a time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Designated number of sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The number of sectors is not set at the parameter.");

        AlarmItem MEMORY_DISK_BATTERY_VOLTAGE_LOW = new AlarmItem("0127", "MEMORY DISK BATTERY VOLTAGE LOW",
                "The battery voltage of the memory disk (MD) is low.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Memory disk (MD) battery life\n" +
                        "       [Measures to Take]\n" +
                        "       Change the battery with a new one.");

        AlarmItem MEMORY_DISK_FORMAT = new AlarmItem("0128", "MEMORY DISK FORMAT",
                "The NC has failed to properly check the control data stored\n" +
                        "       in the memory disk (MD).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The control data has not been properly installed.\n" +
                        "       [Measures to Take]\n" +
                        "       1) Reinstall the control data.\n" +
                        "       2) SRAM card of UCMB is switching.\n" +
                        "       3) UCMB is switching.");

        AlarmItem FLOPPY_DISK_READ_WRITE = new AlarmItem("0130", "FLOPPY DISK READ/WRITE",
                "Read/write processing from and to a floppy disk is not\n" +
                        "       correctly completed.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXXXYY\n" +
                        "       XXXXXX:\n" +
                        "       Contents of result status 0-2 of the floppy disk\n" +
                        "       YY:\n" +
                        "       =05 or 45-> Error in writing\n" +
                        "        05:  head 0\n" +
                        "        45:  head 1\n" +
                        "       =06 or 46-> Error in reading\n" +
                        "        06:  head 0\n" +
                        "        46:  head 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive\n" +
                        "       [Measures to Take]\n" +
                        "       Read and check the data from all the sectors.\n" +
                        "       Try data read/write using the other disk.\n" +
                        "       Try data read/write by setting the problem disk into the other\n" +
                        "       disk drive.\n" +
                        "       When data can be deleted, initialize the disk\n" +
                        "       (by FORMAT command) and retry data writing.");

        AlarmItem FLOPPY_DISK_ACCESS_SECTOR_OVER = new AlarmItem("0131", "FLOPPY DISK ACCESS SECTOR OVER",
                "Among the parameters to be passed to the floppy disk driver\n" +
                        "       routine, the sector number to be accessed is larger than\n" +
                        "       the actual floppy diskette capacity.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Sector number accessed\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Diskette media type is wrong.\n" +
                        "       Contents of VID or SDB in the diskette are destroyed.\n" +
                        "       File directory contents are destroyed.\n" +
                        "       The pointer data showing data block linkage in the sequential\n" +
                        "       file is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Display the sequential file list.\n" +
                        "       Check the contents of VID and SDB directories.");

        AlarmItem FLOPPY_DISK_WRITE_VERIFY = new AlarmItem("0132", "FLOPPY DISK WRITE VERIFY",
                "Data mismatch is discovered when the data written into floppy\n" +
                        "       disk is verified against source data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Physical sector number at which error has occurred\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk or floppy disk drive unit\n" +
                        "       Defective main board or DMA\n" +
                        "       During execution of multi-task, contents of main memory being\n" +
                        "       written by other task have been changed.\n" +
                        "       [Measures to Take]\n" +
                        "       Try again using other floppy disk.\n" +
                        "       Try again using the floppy disk causing the error at another\n" +
                        "       floppy disk drive.\n" +
                        "       Replace the main board.");

        AlarmItem FLOPPY_DISK_SEEK = new AlarmItem("0133", "FLOPPY DISK_SEEK",
                "Floppy disk seek operation is not correctly completed.\n" +
                        "       (\"Seek\" indicates the operation to move the FDD head to\n" +
                        "        the designated track position.)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXYY:\n" +
                        "       XX->Result status 0 of the floppy disk\n" +
                        "       YY->Cylinder number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");

        AlarmItem FLOPPY_DISK_RECALIBRATE = new AlarmItem("0134", "FLOPPY DISK RECALIBRATE",
                "Floppy disk recalibration is not correctly completed.\n" +
                        "       Note: \"Recalibration\" means the operation to move the FDD\n" +
                        "              head to the track No. 0 position.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Contents of result status 0-1 of the floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");


        AlarmItem FLOPPY_DISK_FORMATTING = new AlarmItem("0135", "FLOPPY DISK FORMATTING",
                "Error during floppy disk formatting\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXXXXXX->Contents of result status 0, 1, 2, 3 of floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       Wrong designation of floppy disk type\n" +
                        "       [Measures to Take]\n" +
                        "       Use another diskette");

        AlarmItem FLOPPY_DISK_TIME_OUT = new AlarmItem("0136", "FLOPPY DISK TIME OUT",
                "The floppy disk drive controller does not return the answer\n" +
                        "       within a specified cycle time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       1->During read/write operation\n" +
                        "       2->During formatting\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive unit");

        AlarmItem FLOPPY_READY = new AlarmItem("0137", "FLOPPY READY",
                "The floppy disk is not in the ready state.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The floppy diskette medium is not properly set in the disk\n" +
                        "       unit.\n" +
                        "       [Measures to Take]\n" +
                        "       Check if the READY lamp is lit on the drive unit front panel.");

        AlarmItem FLOPPY_DISK_WRITE_PROTECT = new AlarmItem("0138", "FLOPPY DISK WRITE PROTECT",
                "Writing onto the floppy disk is impossible.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The floppy disk is write-protected.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the disk to write-enabled (by handling the protect\n" +
                        "       notch on the disk.)");

        AlarmItem DMA_TRANSFER = new AlarmItem("0143", "DMA TRANSFER",
                "An error occurred during transfer of DMA, or the transfer\n" +
                        "       operation was not completed.\n" +
                        "       [Character-string]\n" +
                        "       Floppy->An error occurred in the DMA on FRP board.\n" +
                        "       Memory disk->An error occurred in the DMA on the UCMB.\n" +
                        "       [Code]\n" +
                        "       XXXX: DMA error status (Refer to the end of this book.)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)DMA transfer destination board\n" +
                        "       2)Faulty DMA on FRP or UCMB\n" +
                        "       [Measures to Take]\n" +
                        "       1)Change the DMA transfer destination board.\n" +
                        "       2)Change the FRP board.\n" +
                        "       3)Change the UCMB (RAM card or FR card).");

        AlarmItem CAP_ACP_READY = new AlarmItem("0146", "CAP/ACP_READY",
                "An error occurred during initialization of CRP or ACP board.\n" +
                        "       [Code]\n" +
                        "       1->CRP or ACP board ready flag does not come ON.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty CRP or ACP board\n" +
                        "       [Measures to Take]\n" +
                        "       Change the CRP or ACP board.");

        AlarmItem MEMORY_WRITE_READ_TEST = new AlarmItem("0147", "MEMORY WRITE/READ TEST",
                "In the read/write test of the main memory, the written data\n" +
                        "       did not match the read data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Address where the error was found by the main memory test\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Main memory (main board)\n" +
                        "         The code shows the address of the main board.\n" +
                        "       2)A memory-related switch is wrongly set on the main board.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the main board switches for setting.\n" +
                        "       Replace the main board.");

        AlarmItem PROGRAM_LOAD = new AlarmItem("0148", "PROGRAM LOAD",
                "The loading file failed to load the program file.\n" +
                        "       [Character-string] Name of file to be loaded\n" +
                        "       [Code]\n" +
                        "       1->The program file has ended before even one character is\n" +
                        "          loaded.\n" +
                        "       3->The program file has ended during loading operation.\n" +
                        "       9->A wrong device name is designated.\n" +
                        "       10->A wrong file name is designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The program file is destroyed, or a wrong loading file is\n" +
                        "       used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.");

        AlarmItem NOT_FOUND_PROGRAM_FILE = new AlarmItem("0149", "NOT FOUND PROGRAM FILE",
                "The loading file was not able to find the program file to\n" +
                        "       be loaded.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 11\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded does not exist or a wrong loading\n" +
                        "       file is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.");

        AlarmItem PROGRAM_LOAD_ADDRESS = new AlarmItem("0150", "PROGRAM_LOAD_ADDRESS",
                "The file has a wrong load address and, therefore, cannot be\n" +
                        "       loaded using the load information file.\n" +
                        "       [Character-string] Problem file name\n" +
                        "       [Code]\n" +
                        "       1->The file to be loaded is destroyed.\n" +
                        "       2->The file to be loaded or the load information file is\n" +
                        "          destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the data in the file to be loaded.\n" +
                        "       2)Check the load information file data.\n" +
                        "       3)Change the control floppy disk.");

        AlarmItem PROGRAM_ATTRIBUTE = new AlarmItem("0151", "PROGRAM_ATTRIBUTE",
                "The program file to be loaded by the loading file has wrong\n" +
                        "       attributes.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file to be loaded.");

        AlarmItem MEMORY_DISK_ROM_WRITE = new AlarmItem("0152", "MEMORY DISK ROM WRITE",
                "An error occurred during data writing onto the memory disk\n" +
                        "       (FR).\n" +
                        "       [Character-string]\n" +
                        "       Start of writing->Transition from readonly mode to program\n" +
                        "       \t\t  mode does not take place.\n" +
                        "       End of writing->Transition from program mode to readonly mode\n" +
                        "       \t\tdoes not take place.\n" +
                        "       Verify->Verification proved that the data written onto the\n" +
                        "       \tmemory disk (FR) did not match the original data. \n" +
                        "       Element delete->Elements in the memory disk cannot be deleted.\n" +
                        "       Task running->During task running, writing was attempted\n" +
                        "       \t      onto the memory disk (FR).\n" +
                        "       [Code]\n" +
                        "       1->An error occurred in the UCMB.\n" +
                        "       XXXXXXXX: Address near the error location\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1-> Faulty memory disk (FR)\n" +
                        "       2-> Faulty control software (task running)\n" +
                        "       [Measures to Take]\n" +
                        "       1-> Change the UCMB or flash memory card causing the error.\n" +
                        "       2-> Correct the control software (task running).");

        AlarmItem ROMCARD_WRITE_PROHIBIT = new AlarmItem("0153", "ROMCARD WRITE PROHIBIT",
                "Writing was attempted onto the ROM card (PROM card) area\n" +
                        "       mounted in the memory disk.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Partitions are not properly generated because of faulty\n" +
                        "       FRpartfile (extension code: FRI) in the FR control floppy\n" +
                        "       disk No. 1.\n" +
                        "       [Measures to Take]\n" +
                        "       * Change the control floppy disk for FR.");

        AlarmItem FLOPPY_RS232C_BLOCK = new AlarmItem("0154", "FLOPPY RS232C BLOCK",
                "An error occurred with the FR block which controls the UCMB\n" +
                        "       floppy disk and RS-232C.\n" +
                        "       [Code]\n" +
                        "       1 -> There is no response from the FR block firmware.\n" +
                        "       2 -> Illegal access of the main processor to the buffer memory\n" +
                        "            of FR block.\n" +
                        "       1XX -> The FR block firmware detected an error during\n" +
                        "              initialization.\n" +
                        "       Contents of XX\n" +
                        "       bit 7 - bit 30\tFixed\n" +
                        "       bit 2\t\tBuffer memory error\n" +
                        "       bit 1\t\tGeneral purpose register error\n" +
                        "       bit 0\t\tRAM error\n" +
                        "       If an error occurs, the corresponding bit is set ON.\n" +
                        "       There are cases that more than one bit is ON at the same time.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Faulty UCMB\n" +
                        "       [Measures to Take]\n" +
                        "       1) Replace the UCMB.");

        AlarmItem SECTOR_DEVICE_UNINITIALIZED = new AlarmItem("0155", "SECTOR DEVICE UNINITIALIZED",
                "The sector device is not initialized to the OSP format.\n" +
                        "       [Character-string]\n" +
                        "       Specified device name\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Destruction of the VID contents in the memory.\n" +
                        "       [Measures to Take]\n" +
                        "       1) Check the contents of sector 0 (VID).\n" +
                        "       [Referential Instruction Manual]\n" +
                        "       OSP file configuration");


//------------------------------------------------------------------------------------------------------------------------------------//


        list.add(BUS_ERROR);
        list.add(ADDRESS_ERROR);
        list.add(ILLEGAL_INSTRUCTION_ERROR);
        list.add(ZERO_DIVIDE_ERROR);
        list.add(CHK_INSTRUCTION_ERROR);
        list.add(TRAPV_INSTRUCTION_ERROR);
        list.add(PRIVILEGE_VIOLATION_ERROR);
        list.add(TRACE_ERROR);
        list.add(LINE_1010_EMULATOR_ERROR);
        list.add(LINE_1111_EMULATOR_ERROR);
        list.add(EXCEPTION_VECTOR_ERROR);
        list.add(SPURIOUS_INTERRUPT_ERROR);
        list.add(INTERRUPT_ERROR);
        list.add(TRAP_INSTRUCTION_ERROR);
        list.add(USER_INTERRUPT_ERROR);
        list.add(COPROCESSOR_ROTOCOL_ERROR);
        list.add(FORMAT_ERROR);
        list.add(UNINITIALIZED_INTERRUPT_ERROR);
        list.add(FPCP_UNDEFINED_CONDITION_ERROR);
        list.add(FPCP_INEXACT_RESULT_ERROR);
        list.add(FPCP_IVIDE_BY_ZERO_ERROR);
        list.add(FPCP_UNDERFLOW_ERROR);
        list.add(FPCP_OPERAND_ERROR);
        list.add(FPCP_OVERFLOW_ERROR);
        list.add(FPCP_SIGNALING_NAN_ERROR);
        list.add(DEVICE_NAME);
        list.add(SECTOR_DEVICE_NAME);
        list.add(PRINT_DEVICE_NAME);
        list.add(FILE_NAME);
        list.add(COMMAND_CHARACTER);
        list.add(COMMAND_SYNTAX);
        list.add(OPTION);
        list.add(FILE_ATTRIBUTE);
        list.add(DEVICE_FULL);
        list.add(DISK_UNINITIALIZED);
        list.add(ERROR_MAP_INFORMATION);
        list.add(SVCL);
        list.add(MEMORY_DISK_ACCESS_SECTOR_OVER);
        list.add(MEMORY_DISK_ROM_ACCESS);
        list.add(DMA_TRANSFER_SECTOR_OVER);
        list.add(MEMORY_DISK_BATTERY_VOLTAGE_LOW);
        list.add(MEMORY_DISK_FORMAT);
        list.add(FLOPPY_DISK_READ_WRITE);
        list.add(FLOPPY_DISK_ACCESS_SECTOR_OVER);
        list.add(FLOPPY_DISK_WRITE_VERIFY);
        list.add(FLOPPY_DISK_SEEK);
        list.add(FLOPPY_DISK_RECALIBRATE);
        list.add(FLOPPY_DISK_FORMATTING);
        list.add(FLOPPY_DISK_TIME_OUT);
        list.add(FLOPPY_READY);
        list.add(FLOPPY_DISK_WRITE_PROTECT);
        list.add(DMA_TRANSFER);
        list.add(CAP_ACP_READY);
        list.add(MEMORY_WRITE_READ_TEST);
        list.add(PROGRAM_LOAD);
        list.add(NOT_FOUND_PROGRAM_FILE);
        list.add(PROGRAM_LOAD_ADDRESS);
        list.add(PROGRAM_ATTRIBUTE);
        list.add(MEMORY_DISK_ROM_WRITE);
        list.add(ROMCARD_WRITE_PROHIBIT);
        list.add(FLOPPY_RS232C_BLOCK);
        list.add(SECTOR_DEVICE_UNINITIALIZED);

        return list;
    }
}
