#Reference

##Maven Command

1.  mvnw

2.  mvnw compile

3.  mvnw clean package

4.  mvnw spring-boot:run

5.  mvnw clean package spring-boot:run

6.  mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000"

7.  mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=c:\data"

8.  mvnw clean test

##Git Command

1.  git init (initialize local repo, doesn't link to remote yet)

2.  git remote add origin https://github.com/koreanboiboi/reponame.git (create a git remote repo)

3.  git add * (add new/updated files to be commited into local repo)

4.  git status (check files that are going to commit into local repo)

5.  git commit -m "commit message" (commit new/updated files to local repo)

6.  git push -u origin master (create a master branch in github and push files to github master branch repo)

<don't develop in master branch -final/latest working baseline>

7.  git checkout -b develop master (clone a copy from master to develop branch locally)

8.  git push -u origin develop (push from local develop branch to github develop branch)

9.  git checkout develop (to switch between branches)

10. git branch -a (show all local branches and remote branch references)

11. git branch (show all local branches)

<always develop in develop branch>

12. git add *

13. git commit -m "commit changes"

14. git push -u origin develop (push code on local develop branch to github develop branch)

15. git checkout master 

16. git merge develop (after changes in develop branch are complete without errors, in master branch, merge changes from develop branch)

17. git push -u origin master (in master branch to push merged changes from develop branch to github master branch)

##Deploy to heroku

1.  Create/use an existing heroku account

2.  Need system.properties file (java.runtime.version=18)

3.  heroku login

4.  heroku apps:create

5.  git push -u heroku master