// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderMoveTo: ImageVector
  get() {
    val current = _folderMoveTo
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderMoveTo",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.0 13.0 16.59 14.41 19.17 17.0 10.0 17.0 10.0 19.0 19.17 19.0 16.59 21.59 18.0 23.0 23.0 18.0 18.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 13
          moveTo(x = 18.0f, y = 13.0f)
          // L 16.59 14.41
          lineTo(x = 16.59f, y = 14.41f)
          // L 19.17 17
          lineTo(x = 19.17f, y = 17.0f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 10 19
          lineTo(x = 10.0f, y = 19.0f)
          // L 19.17 19
          lineTo(x = 19.17f, y = 19.0f)
          // L 16.59 21.59
          lineTo(x = 16.59f, y = 21.59f)
          // L 18 23
          lineTo(x = 18.0f, y = 23.0f)
          // L 23 18
          lineTo(x = 23.0f, y = 18.0f)
          // L 18 13z
          lineTo(x = 18.0f, y = 13.0f)
          close()
        }
        // m11.17 6 3.42 3.41 .58 .59 H28 v16 H4 V6z m0 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 H16 l-3.41 -3.41 A2 2 0 0 0 11.17 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.17 6
          moveTo(x = 11.17f, y = 6.0f)
          // l 3.42 3.41
          lineToRelative(dx = 3.42f, dy = 3.41f)
          // l 0.58 0.59
          lineToRelative(dx = 0.58f, dy = 0.59f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // l -3.41 -3.41
          lineToRelative(dx = -3.41f, dy = -3.41f)
          // A 2 2 0 0 0 11.17 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.17f,
            y1 = 4.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _folderMoveTo = it }
  }

@Suppress("ObjectPropertyName")
private var _folderMoveTo: ImageVector? = null
