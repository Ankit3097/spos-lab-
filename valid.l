%{
#include<stdio.h>
#include "y.tab.h"
%}

%%
int|float|char|double return BUILTIN;
"," return COMMA;
";" return SC;
[a-zA-Z]+[a-zA-Z0-9]* return ID;
\n return NL;
%%
