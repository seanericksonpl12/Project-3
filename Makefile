
run: compile
	java Frontend
	
compile:Frontend.class Backend.class RedBlackTree.class Pokemon.class PokemonDataReader.class SortedCollectionInterface.class BackendInterface.class
	javac Frontend.java
	javac Backend.java
	javac RedBlackTree.java
	javac Pokemon.java
	javac PokemonDataReader.java
	javac SortedCollectionInterface.java
	javac BackendInterface.java
	

test: testBackend testFrontend testData 
	

testFrontend:Frontend.class TestFrontend.class
	java -jar junit5.jar -cp . --scan-classpath -n TestFrontend
TestFrontend.class: TestFrontend.java
	javac -cp .:junit5.jar TestFrontend.java -Xlint

testBackend:Backend.class BackendTest.class BackendInterface.class RedBlackTree.class SortedCollectionInterface.class
	java -jar junit5.jar -cp . --scan-classpath -n BackendTest
BackendTest.class: BackendTest.java
	javac -cp .:junit5.jar BackendTest.java -Xlint
	@echo "FIXME: *make testFrontend* should compile (when needed) and run all your team's tests for this application"

testData:PokemonDataReader.class DataWranglerTest.class Pokemon.class RedBlackTree.class SortedCollectionInterface.class
	java -jar junit5.jar -cp . --scan-classpath -n DataWranglerTest

DataWranglerTest.class: DataWranglerTest.java
	javac -cp .:junit5.jar DataWranglerTest.java -Xlint
	@echo "FIXME: *make testFrontend* should compile (when needed) and run all your team's tests for this application"

clean:
	$(RM) *.class
