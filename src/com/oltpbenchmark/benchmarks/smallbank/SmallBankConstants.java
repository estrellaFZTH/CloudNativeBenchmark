/***************************************************************************
 *  Copyright (C) 2013 by H-Store Project                                  *
 *  Brown University                                                       *
 *  Massachusetts Institute of Technology                                  *
 *  Yale University                                                        *
 *                                                                         *
 *  Permission is hereby granted, free of charge, to any person obtaining  *
 *  a copy of this software and associated documentation files (the        *
 *  "Software"), to deal in the Software without restriction, including    *
 *  without limitation the rights to use, copy, modify, merge, publish,    *
 *  distribute, sublicense, and/or sell copies of the Software, and to     *
 *  permit persons to whom the Software is furnished to do so, subject to  *
 *  the following conditions:                                              *
 *                                                                         *
 *  The above copyright notice and this permission notice shall be         *
 *  included in all copies or substantial portions of the Software.        *
 *                                                                         *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,        *
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF     *
 *  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. *
 *  IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR      *
 *  OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,  *
 *  ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR  *
 *  OTHER DEALINGS IN THE SOFTWARE.                                        *
 ***************************************************************************/

package com.oltpbenchmark.benchmarks.smallbank;

public abstract class SmallBankConstants {

    // ----------------------------------------------------------------
    // STORED PROCEDURE EXECUTION FREQUENCIES (0-100)
    // ----------------------------------------------------------------
    public static final int FREQUENCY_AMALGAMATE        = 15;
    public static final int FREQUENCY_BALANCE           = 15;
    public static final int FREQUENCY_DEPOSIT_CHECKING  = 15;
    public static final int FREQUENCY_SEND_PAYMENT      = 25;
    public static final int FREQUENCY_TRANSACT_SAVINGS  = 15;
    public static final int FREQUENCY_WRITE_CHECK       = 15;

    // ----------------------------------------------------------------
    // TABLE NAMES
    // ----------------------------------------------------------------
    public static final String TABLENAME_ACCOUNTS   = "ACCOUNTS";
    public static final String TABLENAME_SAVINGS    = "SAVINGS";
    public static final String TABLENAME_CHECKING   = "CHECKING";
    
    public static final int BATCH_SIZE              = 5000;
    
    // ----------------------------------------------------------------
    // ACCOUNT INFORMATION
    // ----------------------------------------------------------------
    
    // Default number of customers in bank
    public static final int NUM_ACCOUNTS            = 1000000;
    
    public static final boolean HOTSPOT_USE_FIXED_SIZE  = false;
    public static final double HOTSPOT_PERCENTAGE       = 25; // [0% - 100%]
    public static final int HOTSPOT_FIXED_SIZE          = 100; // fixed number of tuples
    
    // ----------------------------------------------------------------
    // ADDITIONAL CONFIGURATION SETTINGS
    // ----------------------------------------------------------------
    
    // Initial balance amount
    // We'll just make it really big so that they never run out of money
    public static final int MIN_BALANCE             = 10000;
    public static final int MAX_BALANCE             = 50000;

}
