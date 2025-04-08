Commencer par créer un repository sur github
ouvrir la console dans eclipse (window/show view/console)
se positionner dans le dossier où il y a le code (clique droit sur le dossier du projet eclipse, properties et copier
la partie du lien dans la console (cd etc...)
faire git init (positionne un dossier caché qui permet à git de suivre les modifications de fichier)
faire git remote add origin https:(lien du repository sur github) ce qui permet de connecter le dépôt local à github
(on peut faire git status pour voir les fichiers modifiés, ajoutés ... normalement si le fichier vient d'être créé,
il y a no commits yet)
faire git add . (cela va commit le changement dans l'intégralité du dossier)
si on fait git status, il y a normalement "change to be commited" qui s'est rajouté
pour enregistrer le commit on fait git commit -m "first commit" (-m signifie message, et c'est le message entre "" qui
sera enregistré dans github)
faire git push --set-upstream origin master (Je veux que ma branche locale master soit liée à la branche 
distante origin/master , et que les prochains push/pull se fassent automatiquement avec elle)

ensuite pour cloner depusi un autre pc : 
se positionner dans le repertoir où l'on veut cloner, puis faire git clone lienhttpsgithub
Avant de commencer à travailler sur un appareil : Assurez-vous que votre dépôt local est à jour avec le 
dépôt distant en exécutant :​ git pull origin master
Après avoir apporté des modifications : Une fois vos modifications effectuées et validées (commit), 
envoyez-les vers le dépôt distant avec :
git add .
git commit -m "message"
git push origin master
