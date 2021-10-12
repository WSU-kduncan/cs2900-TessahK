# Project 2 Documentation 
## Container Technologies
- For this project I will be using Docker and Podman.

## How to Install
- Docker:  
To install Docker I followed their online guide. I started by running sudo apt-get update on my Linux VM. Then I installed the necessary packages by typing:  
sudo apt-get install \  
apt-transport-https \  
ca-certificates \  
curl \  
gnupg \  
lsb-release  
Finally, I installed Docker with sudo apt-get install. To verify the installation I typed docker and it brought up the docker guide. 
- Podman:  
To install Podman, I followed their online installation guide. To start I typed sudo apt-get -y update and sudo apt-get -y install podman. I then ran:  
. /etc/os-release  
echo "deb https://download.opensuse.org/repositories/devel:/kubic:/libcontainers:/stable/xUbuntu_${VERSION_ID}/ /" | sudo tee /etc/apt/sources.list.d/devel:kubic:libcontainers:stable.list  
curl -L "https://download.opensuse.org/repositories/devel:/kubic:/libcontainers:/stable/xUbuntu_${VERSION_ID}/Release.key" | sudo apt-key add -  
sudo apt-get update  
sudo apt-get -y upgrade  
sudo apt-get -y install podman  
To verify that it was installed I typed podman --version  

## Pulling A Container Image  
- Docker:  
The image that I decided to pull was Busybox. To pull the image I typed sudo docker pull busybox. To view the image I typed sudo docker images.  
- Podman:
To pull the Busybox images I typed sudo podman pull docker.io/library/busybox. To view the images I typed sudo podman images.  

## Running A Container  
- Docker:  
    1. Initializing versus running the container- The docker create command initializes a container and prepares it for running whereas docker run builds the container as well as runs it. Initialization is helpful for when you want something set up ahead of time but aren't necessarily ready to run it yet. Running the container is useful for when you want something to immediately be initialized and ready to run.  
    2. Run and enter shell- The command docker run -it and then the image name will run the container and open a terminal. This will keep the STDIN open and allocate a pseudo TTY. This would be used when you want to execute commands in one location and one script.  
    3. Run in detached mode- To run in this mode type docker run -d and the image. This makes the container run in the background without interaction and is useful when you want to keep a certain program running at all times.  
- Podman:  
    1. Initializing versus running the container- Podman is the same as docker and uses the create command to initialize a container and the run command to run it. Initialization is helpful for when you want something set up ahead of time but aren't necessarily ready to run it yet. Running the container is useful for when you want something to immediately be initialized and ready to run.  
    2. Run and enter shell- This is also the same as docker and podman uses the -it options to keep the STDIN open as well as allocate a pseudo TTY. This is also used to execute the commands in one location and in one script.  
    3. Run in detached mode- This is also the same as docker and uses the -d option when using the run command to detach the container. This is used to run the container without interaction so that a certain program can continuously run.

## Logs & Status  
- Docker: To view the status of a running container I typed sudo docker ps. To view all containers regardless of status I can type sudo docker ps -a. These commands will show the container ID, image, status, and name of each container. To read the logs of a container I can use the command sudo docker logs and then the name of the container.  
- Podman: To view the status of the containers I can type sudo podman ps as well as sudo podman stats. To view the logs of a container I can type sudo podman logs and the name of a container to view its logs.  

## Stopping a container  
- Docker: Typing sudo docker pause and the name of a container will suspend all processes in the specified container. To unpause the container I can type sudo docker unpause and then the name of the container that is paused. To completely restart a container I can type sudo docker restart and then the name of the container. To stop a container I can type sudo docker stop with the name of the container. To kill a running container I can type sudo docker kill and the name of a container.  
- Podman: To pause a container I can type sudo podman pause and the name of a container. To unpause the container I can type sudo podman unpause and then the name of the container that is paused. To completely restart a container I can type sudo podman restart and then the name of the container. To stop a container I can type sudo podman stop with the name of the container. To kill a running container I can type sudo podman kill and the name of a container.