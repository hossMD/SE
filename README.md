# SE
репа с последними изменениями и всеми лекциями практики с юкософта


*How can I merge my work to branch dev*

- git checkout your_branch_name (newest)
- git pull origin dev

*Now its time to fix your conflicts (you can use for example kdiff3)*

- git push origin your_branch_name
- git checkout dev
- git pull origin dev (this should give no conflicts)
- git merge your_branch_name
