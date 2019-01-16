# Supl Client

This is not an official Google product.

Suplclient is sample code to access supl.google.com

The SuplTester class provides an example on how to use the SUPL Client Project.
The SuplTester sets up the SUPL TCP connection specifications, then at a given latitude and 
longitude sends an LPP SUPL request and prints-out the SUPL server response. 

## Requirement
Make sure protoc binary is installed at /usr/local/bin/protoc
Can be installed easily by the following command on Linux:\
sudo apt-get install libprotobuf-java protobuf-compiler\

For MacOS and Windows, we might need to change the pom.xml or manually complie the proto object file.


## Basic Usage
git clone this repo
use Intellij to import pom.xml and run this project.
main function can be found in SuplTester.java

## License

Suplclient is licensed under the open-source [Apache 2.0 license](LICENSE).

## Contributing

Please [see the guidelines for contributing](CONTRIBUTING.md) before creating
pull requests.
