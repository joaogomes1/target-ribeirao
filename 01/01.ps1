$INDICE = 13
$SOMA = 0
$K = 0;

while ($K -lt $INDICE)
{
    $K++;
    $SOMA = $SOMA + $K;
}

write-host ($SOMA);