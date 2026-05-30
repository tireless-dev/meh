// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotebookReference: ImageVector
  get() {
    val current = _notebookReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotebookReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 7.586 22.0 2.0 27.586 3.414 29.0 9.0 23.414 9.0 27.0 11.0 27.0 11.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 7.586 22
          lineTo(x = 7.586f, y = 22.0f)
          // L 2 27.586
          lineTo(x = 2.0f, y = 27.586f)
          // L 3.414 29
          lineTo(x = 3.414f, y = 29.0f)
          // L 9 23.414
          lineTo(x = 9.0f, y = 23.414f)
          // L 9 27
          lineTo(x = 9.0f, y = 27.0f)
          // L 11 27
          lineTo(x = 11.0f, y = 27.0f)
          // L 11 20
          lineTo(x = 11.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 10
          moveTo(x = 19.0f, y = 10.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 15
          moveTo(x = 19.0f, y = 15.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="7" height="2" x="19.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 20
          moveTo(x = 19.0f, y = 20.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // M28 5 H4 a2 2 0 0 0 -2 2 v10 h2 V7 h11 v20 h13 a2 2 0 0 0 2 -2 V7 a2 2 0 0 0 -2 -2 M17 25 V7 h11 v18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 5
          moveTo(x = 28.0f, y = 5.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
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
          // M 17 25
          moveTo(x = 17.0f, y = 25.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 18z
          verticalLineToRelative(dy = 18.0f)
          close()
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
      .also { _notebookReference = it }
  }

@Suppress("ObjectPropertyName")
private var _notebookReference: ImageVector? = null
