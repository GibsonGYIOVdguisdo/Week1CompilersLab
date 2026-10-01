grammar Characters;

charstring : somechar+ EOF ;

somechar: Uppercase #UppercaseChar
| Lowercase #LowercaseChar
| Digit # DigitChar
;

Uppercase : [A-Z] ;
Lowercase : [a-z] ;
Digit : [0-9] ;
Others : . -> skip ;
