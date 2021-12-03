# Project 4 Documentation
## Investigating Container Networking
Docker: Docker has three networking modes, host, none, and bridge.   
-Bridge routes traffic to the host and doesn't share the namespace.  
-None creates a fully isolated namespace.  
-Host shares the network stack with the host machine.  
The default mode for Docker is bridge. To bind a host port to a container port, docker run -p 80:8080 nginx can be run for example.
  
Podman: Podman has eight networking modes, bridge, none, container, host, network, ns, private, and slirp4netns.   
-Bridge creates a network stack on the default bridge.   
-None creates a namespace for the container but doesn't configure network interfaces.   
-Container reuses another container's network stack.   
-Host doesn't create a namespace but uses the host's network. -Network connects to a user-defined network.   
-NS specifies a path to a network namespace to join.   
-Private creates a new namespace for the container and then uses bridge mode for rootfull containers and slirp4netns for rootless ones.   
-Slirp4netns creates a user network stack.   
Bridge is the default for all rootfull containers and slirp4netns is the default for all rootless containers. To bind a host port to a container port, podman run -p 8080:80/tcp docker.io/library/httpd can be used.
## Investigating Vulnerability Scanners
The Dockerfile linter that I am using is Hadolint. It checks the file to make sure it follows the best practices stated on Docker's official site. It may throw errors or warnings if there is incorrect syntax, the use of sudo, and certain uses of COPY. These are just a few examples but the majority of all errors come from syntax errors.  
Aqua Trivy is a vulnerability scanner that scans images and packages for possible configuration issues that could lead to the risk of attack. It's able to scan OS packages, language-specific packages, and Infrastructure as Code files. The scanner is limited in that it cannot scan individual downloads on your system, but overall it will scan just about anything you would need it to. 