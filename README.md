# Java 8 Features Test


In this very simple project I did some performance investigation with a cool new feature from Java 8. That's work with collections and arrays in parallel.

This test has been ran in a Intel i5-3320 running @2.60GHz and with 8GB RAM, the OS is Windows 7 64Bits
Here the results:


Preparing Data - Creating a String array with 10000000 items

Star Tests

Sorting String array

Starting sort without parallel - Tue Dec 15 17:28:21 EST 2015

Stopping sort without parallel - Tue Dec 15 17:28:42 EST 2015

--------------------------------------------------------------------------------

Preparing Data - Creating a String array with 10000000 items

Starting sort with parallel - Tue Dec 15 17:28:53 EST 2015

Stopping sort with parallel - Tue Dec 15 17:29:02 EST 2015

--------------------------------------------------------------------------------

Preparing Data - Creating a Double array with 10000000 items

Sorting Double array

Starting sort without parallel - Tue Dec 15 17:29:06 EST 2015

Stopping sort without parallel - Tue Dec 15 17:29:12 EST 2015

--------------------------------------------------------------------------------

Preparing Data - Creating a Double array with 10000000 items

Starting sort with parallel - Tue Dec 15 17:29:13 EST 2015

Stopping sort with parallel - Tue Dec 15 17:29:15 EST 2015


--------------------------------------------------------------------------------

-                                    L I S T                                   -

--------------------------------------------------------------------------------

Preparing Data - Creating a String List with 10000000 items

Sorting String List

Starting sort without parallel - Tue Dec 15 17:29:26 EST 2015

Stopping sort without parallel - Tue Dec 15 17:29:42 EST 2015

--------------------------------------------------------------------------------

Sorting String List

Starting sort with parallel - Tue Dec 15 17:29:42 EST 2015

Stopping sort with parallel - Tue Dec 15 17:29:42 EST 2015
