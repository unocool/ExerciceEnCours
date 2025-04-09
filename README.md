Commencer par créer un repository sur github<br>
ouvrir la console dans eclipse (window/show view/console)<br>
se positionner dans le dossier où il y a le code (clique droit sur le dossier du projet eclipse, properties et copier<br>
la partie du lien dans la console (cd etc...)<br>
faire git init (positionne un dossier caché qui permet à git de suivre les modifications de fichier)<br>
faire git remote add origin https:(lien du repository sur github) ce qui permet de connecter le dépôt local à github<br>
(on peut faire git status pour voir les fichiers modifiés, ajoutés ... normalement si le fichier vient d'être créé,<br>
il y a no commits yet)<br>
faire git add . (cela va commit le changement dans l'intégralité du dossier)<br>
si on fait git status, il y a normalement "change to be commited" qui s'est rajouté<br>
pour enregistrer le commit on fait git commit -m "first commit" (-m signifie message, et c'est le message entre "" qui<br>
sera enregistré dans github)<br>
faire git push --set-upstream origin master (Je veux que ma branche locale master soit liée à la branche <br>
distante origin/master , et que les prochains push/pull se fassent automatiquement avec elle)<br>
<br>
ensuite pour cloner depusi un autre pc : <br>
se positionner dans le repertoir où l'on veut cloner, puis faire git clone lienhttpsgithub<br>
<br>
pour que le fichier apparaisse sur eclipse, il faut faire : <br>
file/import/Project from git /appuyer sur next /Existing local repository /appuyer sur next /add/browse le dossier<br>
(selectionner un dossier )/Add /cliquer sur le dossier /next /cliquer sur le dossier (import existing eclipse project <br>
doit être sélectionner) et enfin finish<br>
<br>
Avant de commencer à travailler sur un appareil : Assurez-vous que votre dépôt local est à jour avec le <br>
dépôt distant en exécutant :​ git pull origin master<br>
Après avoir apporté des modifications, envoyez-les vers le dépôt distant avec :<br>
git add .<br>
git commit -m "message"<br>
git push origin master<br>
