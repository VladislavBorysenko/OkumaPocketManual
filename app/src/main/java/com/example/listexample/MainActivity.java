package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<AlarmItem>alarm_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, alarm_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                AlarmItem alarmItem = (AlarmItem)o;
                //Toast.makeText(MainActivity.this, "Selected :" + " " + alarmItem, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<AlarmItem> getListData() {

        List<AlarmItem>list=new ArrayList<AlarmItem>();
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

        return list;
    }
}
