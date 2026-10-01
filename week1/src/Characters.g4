grammar Characters;

charstring : somechar+ EOF ;

somechar: Uppercase #UppercaseChar
| Lowercase #LowercaseChar
| Digit # DigitChar
| Whitespace # WhitespaceChar
| Punctuation # PunctuationChar
| Extended # ExtendedChar
| Others # OtherChar
;

Uppercase : [A-Z] ;
Lowercase : [a-z] ;
Digit : [0-9] ;
Whitespace : [\p{blank}] ;
Punctuation : [\p{punctuation}] ;
Extended : [\u0080-\uFFFF] ;
Others : .;
