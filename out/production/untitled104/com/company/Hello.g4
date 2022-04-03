// define a grammar called Hello
grammar Hello;
program: 'begin' pd+ 'end';
pd:r | z | y | w | x;
r   : 'Text' ID;
z   : 'Scalar' ID;
y   : 'Number' ID;
w   : 'Seal' ID;
x   : 'show' ID;

ID  : [a-z]+ ;
NUMBER : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
