@Before
public void setUp() throws Exception
{
  f1 = new Fraction(1,2);
  f2 = new Fraction(3,4);
  f3 = new Fraction(4,5);
  f4 = new Fraction(1,4);
}

@Test
public void testAdd()
{
  Fraction expected = new Fraction(5,4);
  assertEquals("My message rocks!", expected,f1.add(f2));
  assertNotEquals(expected, f1.add(f2));
}
