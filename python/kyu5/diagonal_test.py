from diagonal import *

def test_diagonal():
    assert generate_diagonal(2, 5) == [1, 3, 6, 10, 15]


def test_diagonal_2():
    assert generate_diagonal(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def test_diagonal_3():
    assert generate_diagonal(3, 7) == [1, 4, 10, 20, 35, 56, 84]
