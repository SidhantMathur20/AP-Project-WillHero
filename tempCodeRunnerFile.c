#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/time.h>
#include <sys/time.h>		
#include <unistd.h>		
#include <signal.h>	
// signal(SIGUSR1,  sigusr1);
// void sigusr1() 
// {  
//     signal(SIGUSR1,sigusr1);
//     printf("SIGUSR1 ....\n");
// }

// struct sigaction action;

// action.sa_flags = SA_SIGINFO; 
// action.sa_sigaction = &sigusr2;

// if (sigaction(SIGUSR2, &action, NULL) == -1) { 
//     perror("sigusr: sigaction");
//     _exit(1);
// }

// void sigusr2(int signo, siginfo_t *info, void *extra) 
// {
//        void *ptr_val = info->si_value.sival_ptr;
//        int int_val = info->si_value.sival_int;
//        printf("Signal %d, value %d  \n", signo, int_val);
// }

int main(int argc, char *argv[])
{
        union sigval value;
        int pid = atoi(argv[1]);

        value.sival_int = atoi(argv[2]);
        value.sival_ptr = (void*) strdup(argv[3]);
        if(sigqueue(pid, SIGUSR2, value) == 0) {
                printf("signal sent successfully!!\n");
        } else {
                perror("SIGSENT-ERROR:");
        }
        return 0;
}