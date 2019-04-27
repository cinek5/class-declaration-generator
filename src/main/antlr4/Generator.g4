
grammar Generator;

/*
 * Compiler Rules
 */

root: TYPENAME '[' attrdef+ ']' NEWLINE ;
attrdef: attrname OFTYPE typename getter? setter? ';' ;
attrname: NAME ;
typename: NAME | TYPENAME ;
getter: 'get' ;
setter: 'set' ;



/*
 * Lexer Rules
 */

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;


OFTYPE : 'oftype' ;

NAME: LOWERCASE (LOWERCASE | UPPERCASE )+ ;

TYPENAME: UPPERCASE (LOWERCASE | UPPERCASE )+ ;

WHITESPACE          : (' ') -> skip ;

NEWLINE             : ('\r'? '\n' | '\r')+ ;
