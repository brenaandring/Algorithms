public int[] squareEven(int[] array, int length)  {
    if (array == null) {
        return array;
    }
    for (int i = 0; i < length; i++) {
        if (i % 2 == 0) {
            array[i] *= array[i];
        }
    }
    return array;
}