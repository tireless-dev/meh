// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderTree: ImageVector
  get() {
    val current = _folderTree
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderTree",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 15 h11 a1 1 0 0 0 1 -1 V7 a1 1 0 0 0 -1 -1 h-5 l-.72 -1.45 A1 1 0 0 0 20.38 4 H16 a1 1 0 0 0 -1 1 v4 H6 V2 H4 v22 a2 2 0 0 0 2 2 h9 v3 a1 1 0 0 0 1 1 h11 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -1 -1 h-5 l-.72 -1.45 a1 1 0 0 0 -.9 -.55 H16 a1 1 0 0 0 -1 1 v4 H6 V11 h9 v3 a1 1 0 0 0 1 1 m1 -9 h2.76 l.45 .89 L20.76 8 H26 v5 h-9z m0 15 h2.76 l.45 .89 .55 1.11 H26 v5 h-9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 15
          moveTo(x = 16.0f, y = 15.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // l -0.72 -1.45
          lineToRelative(dx = -0.72f, dy = -1.45f)
          // A 1 1 0 0 0 20.38 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.38f,
            y1 = 4.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // l -0.72 -1.45
          lineToRelative(dx = -0.72f, dy = -1.45f)
          // a 1 1 0 0 0 -0.9 -0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.9f,
            dy1 = -0.55f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // m 1 -9
          moveToRelative(dx = 1.0f, dy = -9.0f)
          // h 2.76
          horizontalLineToRelative(dx = 2.76f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // L 20.76 8
          lineTo(x = 20.76f, y = 8.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
          // m 0 15
          moveToRelative(dx = 0.0f, dy = 15.0f)
          // h 2.76
          horizontalLineToRelative(dx = 2.76f)
          // l 0.45 0.89
          lineToRelative(dx = 0.45f, dy = 0.89f)
          // l 0.55 1.11
          lineToRelative(dx = 0.55f, dy = 1.11f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
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
      .also { _folderTree = it }
  }

@Suppress("ObjectPropertyName")
private var _folderTree: ImageVector? = null
