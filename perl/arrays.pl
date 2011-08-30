use strict;
use warnings;

my @array = (
	"print",
	"these",
	"strings",
	"out",
	"for",
	"me", # Trailing comma is OK
);

print $array[0]." "; #The $ is needed because what you are accessing is a scalar, not an array.
print $array[1]." ";
print $array[2]." ";
print $array[3]." ";
print $array[4]." ";
print $array[5]."\n";
