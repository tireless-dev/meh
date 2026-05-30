// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentProtected: ImageVector
  get() {
    val current = _documentProtected
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentProtected",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 21 v-3 a4 4 0 0 0 -8 0 v3 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m-6 -3 a2 2 0 0 1 4 0 v3 h-4Z m-2 10 v-5 h8 v5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 21
          moveTo(x = 28.0f, y = 21.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // m -6 -3
          moveToRelative(dx = -6.0f, dy = -3.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
          close()
        }
        // m23.5 9.09 -6.8 -6.8 A1 1 0 0 0 16 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h8 v-2 H6 V4 h8 v6 a2 2 0 0 0 2 2 h6.3 a1.7 1.7 0 0 0 1.2 -2.91 M16 10 V4.41 L21.59 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 9.09
          moveTo(x = 23.5f, y = 9.09f)
          // l -6.8 -6.8
          lineToRelative(dx = -6.8f, dy = -6.8f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 6.3
          horizontalLineToRelative(dx = 6.3f)
          // a 1.7 1.7 0 0 0 1.2 -2.91
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.2f,
            dy1 = -2.91f,
          )
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // V 4.41
          verticalLineTo(y = 4.41f)
          // L 21.59 10z
          lineTo(x = 21.59f, y = 10.0f)
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
      .also { _documentProtected = it }
  }

@Suppress("ObjectPropertyName")
private var _documentProtected: ImageVector? = null
