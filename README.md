# 2425-2nd-cc3-1e-rpg

# Contributing to this repository

## Cloning the repository

You should already have Git installed. Install Git if you haven't already https://git-scm.com/

1. Navigate to the link of the repository https://github.com/pacalso-jjc/2425-2nd-cc3-1e-rpg
1. Click on the green button labeled as Code, then copy the link provided.
1. Open cmd or git-bash in your machine.
1. Navigate to where you want to clone the repository.
    `cd C:\dev`
1. Clone the repository by executing the following command
    `git clone https://github.com/pacalso-jjc/2425-2nd-cc3-1e-rpg.git`
1. Start making changes on the files you have cloned!


## Creating branches

You should already have a task pickup before proceeding to the following steps.

1. Go to the project tab of the repository then open the project.
1. Click on the title of the task you are working on.
1. On the right, under the development tab, there is a blue text saying "Create a branch", click the text.
1. Rename the branch to the format `doc-#` for documentation tasks or `feat-#` for feature tasks where # is the number of the task you are working on


## Checking out the branch to your local machine

You should already have installed git, cloned the project, and created a personal branch by this point.

1. Open cmd or git-bash
1. Navigate to where you cloned the project i.e `cd C:\dev\2425-2nd-cc3-1e-rpg`
1. Checkout the branch you have created i.e `git checkout branch-name` where branch-name is the name of your created branch e.g `doc-1` or `feat-67`

## Modifying the files in your personal branch

Make sure you are on your personal branch by this point.

1. Modify the files inside the repository by using notepad/notepad++, visual studio code, or your preferred text editor. Using IDE is not recommended.
1. After modifying a file you can start adding/committing/pushing your changes to your personal branch.
1. After making changes to the file go ahead and start cmd or git-bash to start adding the files to git and pushing it to github.
1. Add the files you have changed using `git add filename.txt` where filename.txt is the file you have modified.
1. To show the files that you modified you can execute the command `git status`
1. Once you have accumulated the files you want to add to git commit them using `git commit -m "Add description here"`. Please make sure to add a short and sweet message describing the change you have done.
1. Repeat the add and commit process until you have accumulated enough change and want to push them to github. To push the changes to github execute the `git push` command.
1. Once `git push` is executed you should be able to see your change now on your branch in the repository in Github.


## Creating pull requests to merge changes to main

By this point you are now done with your change in your personal branch and is ready to merge them to main

1. Open the repository on your browser.
1. Click on the Pull Request tab on the repository.
1. Click create pull request.
1. Select your personal branch you want to merge to main.
1. Click Create.
1. Assign the pull request to your instructor for review.
1. Set the task in the github project to In Review

