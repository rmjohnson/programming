use strict;
use warnings;

# Hash variables are arrays with string indexs. Format is Index => Scalar
my %scientists = (
	"Newton" => "Isaac",
	"Einstein" => "Albert",
	"Darwin" => "Charles",
);

print $scientists{"Newton"}." ";
print $scientists{"Einstein"}." ";
print $scientists{"Darwin"}."\n";
