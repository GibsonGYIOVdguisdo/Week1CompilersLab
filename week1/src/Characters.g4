grammar Characters;

charstring : somechar+ EOF ;

somechar:
  Keyword #Keyword
| Identifier #Identifier
| Operation #Operation
| Semicolon #Semicolon
| Integer #Integer
| Uppercase #UppercaseChar
| Lowercase #LowercaseChar
| Digit # DigitChar
| Whitespace # WhitespaceChar
| Punctuation # PunctuationChar
| Extended # ExtendedChar
| Others # OtherChar
;

Operation : '+' | '-' | '*' | '/' | '=' | '==';
Keyword : 'if' | 'then' | 'else' | 'for' ;
Integer : '0' | '-'?[1-9][0-9]*;
Identifier : [a-z][a-z0-9_]+;
Uppercase : [A-Z] ;
Lowercase : [a-z] ;
Digit : [0-9] ;
Whitespace : [\p{blank}] ;
Punctuation : [\p{punctuation}] ;
Extended : [\u0080-\uFFFF] ;
Semicolon: ';' ;
Others : .;
