// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderOff: ImageVector
  get() {
    val current = _folderOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 h-2.59 L30 3.41 28.59 2 2 28.59 3.41 30 l2 -2 H28 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 m0 18 H7.41 l16 -16 H28Z M4 6 h7.17 l3.42 3.41 .58 .59 H18 V8 h-2 l-3.41 -3.41 A2 2 0 0 0 11.17 4 H4 a2 2 0 0 0 -2 2 v18 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // h -2.59
          horizontalLineToRelative(dx = -2.59f)
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
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
          // m 0 18
          moveToRelative(dx = 0.0f, dy = 18.0f)
          // H 7.41
          horizontalLineTo(x = 7.41f)
          // l 16 -16
          lineToRelative(dx = 16.0f, dy = -16.0f)
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // h 7.17
          horizontalLineToRelative(dx = 7.17f)
          // l 3.42 3.41
          lineToRelative(dx = 3.42f, dy = 3.41f)
          // l 0.58 0.59
          lineToRelative(dx = 0.58f, dy = 0.59f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _folderOff = it }
  }

@Suppress("ObjectPropertyName")
private var _folderOff: ImageVector? = null
