package com.example.oshilibrary;

import androidx.appcompat.app.AppCompatActivity;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

import android.os.Bundle;

public class MainActivity  {
    public static void main(String... args) {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();

        System.out.println(processor.toString());
    }
}